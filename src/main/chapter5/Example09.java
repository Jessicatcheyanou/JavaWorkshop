package main.chapter5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*dealing with exceptions that are not a subclass of one another,
it is possible to catch both exceptions using a logical OR operator
 */

public class Example09 {
    public static void main(String[] args){
        //declare a list that will contain all of the files
        //inside of the readme.txt file

        List<String> lines = Collections.emptyList();

        try {
            //provoke an exception
            lines = Files.readAllLines(Paths.get("readme.txt"));
        } catch (NullPointerException|IOException ex){
            if (ex instanceof NullPointerException) {
                System.out.println("Exception: NullPointer");
            }
            if (ex instanceof IOException){
                System.out.println("Exception: File Not Found");
            }

        }

        //you will never see this print
        Iterator<String> iterator = lines.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
