package main.chapter04;

/*print elements from a list using iterator
from Collections framework.It can be used with lists
sets,queues and even maps
 */
import java.util.*;

public class Example16 {
    public static void main(String[] args){
        List array = new ArrayList();

        array.add(5);
        array.add(2);
        array.add(37);

        Iterator iterator = array.iterator();

        while (iterator.hasNext()){
            //point to next element

            int i = (Integer) iterator.next();

            //print elements
            System.out.println(i + "");
        }

    }
}
