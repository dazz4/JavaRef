package com.kaminsky.basics;

public class ShortCircuitLogicalOperators {
    public static void main(String[] args) {

        // If you use || and && instead of | and & Java will not bother to evaluate the
        // right hand operand when the outcome of the expression can be determined by the left operand alone.
        // || and && are used for Boolean operations while single-character versions are rather for bitwise operations

        int c=0,e=0,d=0;

        // Here, using a single & ensures that the increment operation will be applied to e whether
        // c is equal to 1 or not.

        if(c==1 & e++ < 100) d = 100;
        System.out.println(e);
//
    }
}
