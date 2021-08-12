package main.chapter04;
/*compare arrays
* possibility of using deepEquals */

import java.util.Arrays;

public class Example03 {
    public static void main(String[] args){
        int[] numbers1 = new int[3];
        Arrays.fill(numbers1,1);

        int[] numbers2 = {0,0,0};
        boolean comparison = Arrays.equals(numbers1,numbers2);

        System.out.println("Are numbers1 and numbers2 arrays equal?" + comparison);

        int[] numbers3 = {1,1,1};
        comparison = Arrays.equals(numbers1,numbers3);

        System.out.println("Are numbers1 and numbers3 arrays equal?" + comparison);
    }

}
