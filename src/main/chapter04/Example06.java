package main.chapter04;
/*Using the Collections class to populate a set
 from an array of Strings*/

import java.util.*;

public class Example06 {

    public static void main(String[] args){
        String[] myArray = new String[] {"3","25","2","79","3"};

        Set mySet = new HashSet();

        //populates sets while removing duplicates
        Collections.addAll(mySet,myArray);
        System.out.println(mySet);

    }
}
