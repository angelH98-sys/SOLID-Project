package modelos;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logging {
    public Logger logger;
    FileHandler fh;

    public void Log(String file_name) throws SecurityException, IOException {

        File f = new File(file_name);
        if(!f.exists())
        {
            f.createNewFile();
        }
        fh = new FileHandler(file_name, true);
        logger = Logger.getLogger("testeo");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
    }
}
