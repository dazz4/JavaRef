package com.kaminsky.basics;

public class TypePromotion {
    public static void main(String[] args) {


    /* The type promotion rules
    All byte, short and char values are promoted to int.
    If the operand is long, the whole expression is promoted to long.
    If one operand is a float, the entire expression is promoted to float
    If any of the operands are double, the result is double */

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}
