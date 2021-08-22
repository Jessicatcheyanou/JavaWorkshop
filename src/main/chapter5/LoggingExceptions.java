package main.chapter5;
/*Exercise 1*/
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExceptions {
    public static void main(String[] args){
        Logger logger = Logger.getAnonymousLogger();
        String s = null;

        try {
            System.out.println(s.length());
        } catch (NullPointerException ne){
            logger.log(Level.SEVERE,"Exception happened",ne);
        }
    }
}
