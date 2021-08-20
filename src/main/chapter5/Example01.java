package main.chapter5;
/* Some examples of Exceptions-NullPointer Exception*/

public class Example01 {
        public static void main(String[] args){
            //declare a string with nothing inside
            String text = null ;

            //you will see this at the console
            System.out.println("Go Java Go|");

            //null'e string should crash your program
            System.out.println(text.length());

            //You will never see this print
            System.out.println("You will never see me");

        }

}
