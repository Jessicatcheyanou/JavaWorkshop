package main.chapter04;
/*Using Arrays t programmatically populate
Collections
Populate a set using an array
 */

import java.util.*;

public class Example05 {

    public static void main(String[] args) {
        String[] myArray = {"Jessica", "Ines"};

        //set is sorted(as it inherits the properties of list) and duplicates removed
        Set<String> mySet = new HashSet<String>(Arrays.asList(myArray));

        //print set
        System.out.println(mySet);
    }
}
