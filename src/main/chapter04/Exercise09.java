package main.chapter04;

import java.util.*;
/*Intersection Operation on Sets*/

public class Exercise09 {

    public static void main(String[] args){
        Integer[] numbers1 = new Integer[]{3,25,2,79,2};
        Integer[] numbers2 = new Integer[]{7,12,14,79};

        Set set1 = new HashSet();
        Collections.addAll(set1,numbers1);

        Set set2 = new HashSet();
        Collections.addAll(set2,numbers2);

        set1.retainAll(set2);

        System.out.println(set1);

    }
}
