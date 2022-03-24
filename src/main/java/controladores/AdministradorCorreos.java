package controladores;

import modelos.ConfigEnviarCorreos;

public class AdministradorCorreos {

    public void enviarMail(String mail, String valorRuta) {
        //Creando Objeto
        ConfigEnviarCorreos utilidadesCorreo = new ConfigEnviarCorreos();
        utilidadesCorreo.enviar( mail, "Ticket: "+utilidadesCorreo.generarCodigo(),
                "Remitimos su Ticket adjunto en este correo.<br> Gracias por Preferirnos",valorRuta);
    }


}
