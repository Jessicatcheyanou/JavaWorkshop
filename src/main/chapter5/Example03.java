package main.chapter5;



import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Example03 {
    public static void main(String[] args){
        //declare a list that ill contain all of the files
        //inside of the readme.txt file
        List<String> lines = Collections.emptyList();

        //provoke an exception
        //lines = Files.readAllLines(Paths.get("readme.txt"));

        //you will never see this print
        Iterator<String> iterator = lines.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
