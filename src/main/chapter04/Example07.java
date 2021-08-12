package main.chapter04;
/*Using Collections to populate a Set from an Array of Integers*/

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Example07 {

    public static void main(String[] args){
        Integer[] myArray = new Integer[]{3,25,2,79,3};

        Set mySet = new HashSet();

        //populates and sorts sets while removing duplicates
        Collections.addAll(mySet,myArray);
        System.out.println(mySet);

    }
}

