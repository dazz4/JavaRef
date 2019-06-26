package com.kaminsky.lambda;

// Functional interface with no parameters
interface MyInter {
    double getValue();
}

// Functional interface with 1 parameter
interface NumericTest {
    boolean test(int n);
}

// Functional interface with 2 parameters
interface NumericTest2 {
    boolean test(int n, int d);
}

// Generic functional interface with one parameter extending "Number"
interface GenericTest<T extends Number> {
    T func(T t);
}

class lambdaDemo {

    public static void main(String[] args) {

        MyInter myInter; // declare and interface reference
        myInter = () -> 123.45; // lambda expression, the types has to be compatible
        System.out.println(myInter.getValue()); // call getValue();
        myInter = () -> Math.random() * 123.3; // more advanced lambda
        System.out.println(myInter.getValue());

        // Lambda with a parameter
        NumericTest numericTest; // declare and interface reference
        numericTest = (n) -> n == 2; // setup lambda expression
        System.out.println(numericTest.test(4)); // use interface method with the parameter

        numericTest = n -> n < 0; // you don't have to use parenthesis if it's only one argument

        // Lambda expression with 2 parameters
        NumericTest2 numericTest2 = (n,d) -> n % d == 0; // you can put everything in one line
        System.out.println(numericTest2.test(10,2));

        // if you have to explicitly declare the type of a parameter
        //then all of the parameters must have declared types
        NumericTest2 numericTest21 = (int n, int d) -> n % d == 0; // this is okay
        // NumericTest2 numericTest21 = (int n, d) -> n % d == 0; // this not okay

        // Blocked lambda expressions
        // You you have to use "return" in block lambdas
        NumericTest2 blockLambda = (n,d) -> {
            for (int i = 0; i < d; i++) {
                System.out.println("n = " + n++ + " " + "d = " + d);
            }
            return true;
        };
        blockLambda.test(0, 10);

        // Using Generic Functional Iterface
        GenericTest<Integer> genericTest = (i) -> 2 * i;
        GenericTest<Double> genericTest1 = (d) -> 2 * d;

        System.out.println(genericTest.func(2));
        System.out.println(genericTest1.func(2.2));



    }

}
