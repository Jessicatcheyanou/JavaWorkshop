package main.chapter5;

import java.nio.file.NoSuchFileException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionLoggingData {

    public static void issuePointerException() throws NullPointerException{
        throw new NullPointerException("Exception:File Not Found");
    }

    public static void issueFileException() throws NoSuchFileException {
        throw new NoSuchFileException("Exception;File Not found");
    }

    public static void main(String[] args){
        int exceptionNum = Integer.valueOf(args[0]);
        Logger logger = Logger.getAnonymousLogger();

        switch (exceptionNum){
            case 1:
                try {
                    issuePointerException();
                } catch (NullPointerException ne){
                    logger.log(Level.SEVERE,"Exception happened",ne);
                }
                break;

            case 2:
                try {
                    issueFileException();
                } catch (NoSuchFileException nse){
                    logger.log(Level.WARNING,"No such file Exception happened",nse);
                }
                break;

            case 3:
                try {
                    issueFileException();
                } catch (NoSuchFileException nsee){
                    logger.log(Level.INFO,"No such file Exception happened");
                }
                break;
        }


    }
}
