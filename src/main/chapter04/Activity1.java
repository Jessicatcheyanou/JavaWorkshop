package main.chapter04;

/*Search for the ocurence of a word
in an Array
 */

public class Activity1 {

    public static void main(String[] args){
        String[] text = {"So","many","books","so","little","time"};
        String searchWord = "so";


        int occurence = -1;

        for (int i = 0; i < text.length; i++) {
            occurence = text[i].compareToIgnoreCase(searchWord);
            if (occurence == 0){
                System.out.println("Found searchWord at:" + i);
            }
        }


    }

}
