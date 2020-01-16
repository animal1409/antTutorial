package oata;
import org.apache.log4j.Logger;
//import org.apache.log4j.BasicConfigurator;
/**
 * Clase de HelloWorld
 */
public class HelloWorld {
    /**
     * es el logger
     */
    static Logger logger = Logger.getLogger(HelloWorld.class);
    /** clase main */
    public static void main(String[] args) {
        //BasicConfigurator.configure();
        //System.out.println("Hello World");
        logger.info("Hello World");
    }
}