package main.functionalProgramming;

public final class Calculate {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Usage: Calculate [int] [operator]");
            return;
        }

        Calculator calculator = new Calculator();
        //Register the four "basic" binary operators: +,-,*,/
        //Operations are represented by Lambda expressions
        //They can also be represented using method references,but to note that
        //Method references cannot capture variables
        calculator.registerOperation("+",(a,b) -> a + b);
        calculator.registerOperation("-",(a,b) -> a - b);
        calculator.registerOperation("/",(a,b) -> a / b);
        calculator.registerOperation("*",(a,b) -> a * b);

        int a = Integer.parseInt(args[0]);
        String operator = args[1];
        int b = Integer.parseInt(args[2]);

        System.out.println(calculator.calculate(a,operator,b));
    }
}
