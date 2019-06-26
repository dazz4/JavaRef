package com.kaminsky.exceptionHandling;

public class Exc0 {
    public static void main(String[] args) {
        int d,a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("This will not be printed");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero.");
        }
        System.out.println("After catch statement.");
    }
}
