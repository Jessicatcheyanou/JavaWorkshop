package main.chapter04;

import java.util.Arrays;

public class Example01 {

    public static void main(String[] args) {
        //declare array of text
        String[] text = new String[]{"spam", "more", "buy"};

        //sort array of text
        Arrays.sort(text);

        //print array of text
        System.out.println(Arrays.toString(text));

        for (int i = 0; i < text.length ; i++) {
            System.out.println(text[i] + " ");
        }


    }

}
