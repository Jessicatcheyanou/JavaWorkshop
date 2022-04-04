package main.functionalProgramming;

@FunctionalInterface
public interface BinaryOperation<Integer> {
    /**
     *  the functional method
     *  BinaryOperation's one abstract method
     */
    int apply(int x, int y);
}
