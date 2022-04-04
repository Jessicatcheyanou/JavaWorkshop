package main.functionalProgramming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public final class LambdasMain {
    /** Returns the number of strings that match a given condition
     * @param input the strings that should be tested.
     * @param condition the condition that strings should be tested against
     * @return the number of strings in the input that match the condition.
     *
     */

    public static long countMatchingStrings(List<String> input, Predicate<String> condition){
        return input.stream().filter(condition).count();
    }

    /**
     *  Identical to
     *  BinaryOperator<Integer> add = (Integer a,Integer b) -> { return a + b;};
     */
    BinaryOperator<Integer> add = Integer::sum;



    public static void main(String[] args) {
        List<String> input = List.of("hello","\t  ","world","","","\t"," ","\t"," ","goodbye", " ");
        long numberOfWhiteSpaceStrings = countMatchingStrings(input,s -> s.trim().isEmpty());
        System.out.println(numberOfWhiteSpaceStrings + " " + "whitespace strings");

        BinaryOperator<Integer> add = Integer::sum;
        System.out.println(add.apply(4,6));
    }
}
