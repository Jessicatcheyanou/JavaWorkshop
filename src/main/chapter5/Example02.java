package main.chapter5;
/* StringIndex OutOf Bound Excpeption*/
public class Example02 {
     public static void main(String[] args){
         //declare a string of a fixed length
         String text = "1 < 3 bananas";

         //provoke an exception
         char character = text.charAt(15);//get the 15th element

         //you will never see this print
         System.out.println("done");


     }

}
