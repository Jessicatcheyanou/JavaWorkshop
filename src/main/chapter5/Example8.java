package main.chapter5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Example8 {
    public static void main(String[] args){
        //declare a list that will contain all of the files
        //inside of the readme.txt file
        List<String> lines = Collections.emptyList();

        try {
            //provoke an exception
            lines = Files.readAllLines(Paths.get("readmetxt"));
        } catch (NoSuchFileException fe){
            System.out.println("Exception;File not found");
        } catch (IOException ioe){
            System.out.println("Exception: IOException");
        }

        //you will never see this print
        Iterator<String> iterator = lines.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
