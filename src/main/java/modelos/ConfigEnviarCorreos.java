package modelos;

import lombok.Getter;
import lombok.Setter;
//--Agregando los import para el envio de correo
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeBodyPart;
import javax.mail.Multipart;
import javax.mail.internet.MimeMultipart;
import javax.activation.FileDataSource;
import javax.activation.DataHandler;

public class ConfigEnviarCorreos {
    @Setter @Getter
    private String host;
    @Setter @Getter
    private String puerto;
    @Setter @Getter
    private String usuario;
    @Setter @Getter
    private String password;
    @Setter @Getter
    private String destinatario;

    public ConfigEnviarCorreos() {
        //Detalles de conexion para envio SMTP
        host 	= "smtp.gmail.com";
        puerto	= "465";
        //Usuario Generico de envío de información
        usuario = "proyectosolidg1@gmail.com";
        password = "prueba123456";
    }

    public ConfigEnviarCorreos(String host, String puerto, String usuario, String password) {
        this.host = host;
        this.puerto = puerto;
        this.usuario = usuario;
        this.password = password;
    }

    public void enviar( String receptor, String asunto, String mensaje, String valorRuta) {

        //Seteando las propiedades para el envio de correo
        Properties props = new Properties();
        props.put( "mail.smtp.host", host );
        props.put( "mail.smtp.port", puerto );
        props.put( "mail.smtp.ssl.enable", "true" );
        props.put( "mail.smtp.auth", "true" );

        // Create the Session Object
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(usuario, password);

            }

        });

        try {

            MimeMessage message = new MimeMessage(session);

            //Correo desde donde se envía
            message.setFrom( new InternetAddress( usuario ) );

            // Destinatario
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(receptor));

            // Asunto
            message.setSubject( asunto );

            // Mensaje en MultiPartes para colocar Adjunto
            MimeBodyPart contentPart = new MimeBodyPart();

            contentPart.setText( mensaje, "utf-8", "html" );

            //Archivo Adjunto
            MimeBodyPart attachmentPart = new MimeBodyPart();

            FileDataSource fileDataSource = new FileDataSource( valorRuta );

            attachmentPart.setDataHandler( new DataHandler( fileDataSource ) );
            attachmentPart.setFileName( fileDataSource.getName() );

            Multipart multipart = new MimeMultipart();

            multipart.addBodyPart( contentPart );
            multipart.addBodyPart( attachmentPart );

            // Mensaje Final a Enviar
            message.setContent( multipart );

            Transport.send( message );

        }
        catch( MessagingException exc ) {

            throw new RuntimeException("No fue posible enviar el correo");
        }
    }

    //Función que genera el código de ticket que se envía por correo
    public int generarCodigo(){
        Random rand = new Random();
        int upperbound = 1000;
        //generate random values from 0-24
        //TODO: Una vez se confirme por que de 0-24 remover el comentario anterior
        int int_random = rand.nextInt(upperbound);
       return int_random;
    }

}

