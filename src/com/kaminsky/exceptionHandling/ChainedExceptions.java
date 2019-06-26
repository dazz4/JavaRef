package com.kaminsky.exceptionHandling;

public class ChainedExceptions {

    static void procDemo(){

        // create an exception
        NullPointerException e = new NullPointerException("top layer");

        e.initCause(new ArithmeticException("cause"));

        throw e;
    }

    public static void main(String[] args) {
        try {
            procDemo();
        } catch (NullPointerException e) {
            // display top level exception
            System.out.println("Caught: " + e);

            // display cause exception
            System.out.println("Original cause: " + e.getCause());
        }

        // Catching multiple exceptions

        int a = 10, b=0;
        int vals[] = {1, 2, 3};

        try {
            int result = a / b; // generate an ArithmeticException
//          vals[10] = 19; // generate an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        System.out.println("After multi-catch.");
    }
}
