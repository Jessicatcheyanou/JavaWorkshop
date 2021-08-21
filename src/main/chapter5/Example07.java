package main.chapter5;

public class Example07 {

    public static void main(String[] args){
        //declare a string with nothing inside
        String text = null;

        //you will see this at the console
        System.out.println("Go Java,Go!");

        try {
            //code that will generate an exception of the type NullPointerException
            //null'ed strings should crash your program
            System.out.println(text.length());
        } catch (NullPointerException ex){
            //code to be executed in case of exception happening
            System.out.println("Exception:cannot get the text's length");
        }
        //you will now see this print
        System.out.println("done");
    }
}
