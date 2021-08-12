package main.chapter04;
/*Using ListIterator*/

import java.util.*;

public class Example17 {

    public static void main(String[] args) {
        List<Double> array = new ArrayList();

        array.add(5.0);
        array.add(2.2);
        array.add(37.5);
        array.add(3.1);
        array.add(1.3);

        System.out.println("Original List:" + array);

        ListIterator listIterator = array.listIterator();

        while (listIterator.hasNext()){
            //point to next element
            double d = (Double) listIterator.next();

            //round up to decimal number
            listIterator.set(Math.round(d));
        }
        System.out.println("Modified list: " + array);
    }

}
