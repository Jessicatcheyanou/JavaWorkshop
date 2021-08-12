package main.chapter04;
/* usng subList() to get and print a portion of a list of items*/

import java.util.*;

public class Example14 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("No");
        list.add("matter");
        list.add("what");
        list.add("you");
        list.add("do");

        System.out.println(list);

        List list1= list.subList(2,4);
        System.out.println(list1);

        //select a portion of a list and remove it*/
        list.subList(2,4).clear();
        System.out.println(list);


    }
}
