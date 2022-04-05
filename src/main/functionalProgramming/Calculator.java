package main.functionalProgramming;

import java.util.*;
import java.util.function.BinaryOperator;

/**
 * Obviously, real-world calculators are a lot more robust. For starters,
 * they are able to operate on more than two operands at a time,
 * and therefore they have to handle the order of operations (for example: 3 + 12 / 5 * ( 4 - 2)).
 * However, even the most feature-rich calculators have a mapping somewhere that defines what the operators are,
 * and what symbols are used to represent those operators. Today, you demonstrated how to accomplish that succinctly with Java lambdas.
 *
 * By the way, this little program uses a design pattern known as the Strategy Pattern:
 * the calculator employs a different operation "strategy" depending on which operation symbol is parsed from the command-line argument.
 * You'll learn more about the strategy pattern in the lesson on design patterns.
 */

public final class Calculator {
    //Mapping of operator symbols to operations
    private final Map<String, BinaryOperator<Double>> operators = new HashMap<>();

    public  void registerOperation(String symbol, BinaryOperator<Double> operator){
        operators.put(symbol.strip(),operator);
    }

    public double calculate(double a,String operator,double b){
        return operators.get(operator).apply(a,b);
    }
}
