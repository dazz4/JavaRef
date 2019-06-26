package com.kaminsky.basics;

public class ControlStatements {
    public static void main(String[] args) {

        // Java's program control statements can be put into the following categories: selection, iteration and jump.
        // Two selection statements: if and switch

        // IF STATEMENT -------------------------------------------------------------------

        // if(condition) statement1;
        // else statement2;

        int a = 1, b = 2;
        if (a < b) a = 0; // you don't need curly braces if you have only one statement to execute
        else b = 0;

        // Nested ifs
        if (a == b) {
            if (a < 20) a = b;
            if (b < 5) a = 10;
            else b = 10;
        } else b = a;

        // SWITCH STATEMENT  -------------------------------------------------------------------

        // Switch statement can only test for equality, whereas if can evaluate and type of Boolean expression

        /*
         switch(expression){
         case value1:
              statement sequence
         break;
         case value2:
              statement sequence
         break;
         default:
              statement sequence
        }
        */

        // Java's iteration statements are for, while and do-while so called loops

        // WHILE -------------------------------------------------------------------

        // Since the while loop evaluates its conditional expression at the top of the loop, the body of the loop
        // will not execute even once if the condition is false to begin with.

        int n = 6;
        while (n < 5) {
            System.out.println("Test" + n);
            n++;
        }

        // To execute the code at least once we use do-while loop

        do {
            System.out.println("Test" + n);
            n++;
            System.out.println("Test" + n);
        } while (n < 5);

        do {
            System.out.println("tick " + n);
        }
        while (--n > 0);

        boolean quit = true;
        while (quit) {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
            quit = false;
        }

        // FOR -------------------------------------------------------------------

        // 1. Initialization of the control variable
        // 2. Evaluation of the condition
        // 3. Incrementation of the control variable

        for (int i = 0; i < 2; i++) {

            System.out.println("tick " + i);

        }

        // You can include multiple statements in both the initialization and iteration portions of the for.

        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        // The condition can be Boolean

        boolean done = false;
        for (int i = 1; !done; i++) {
            // statements
            done = true;
        }

        // The initialization or the iteration expression or bot may be absent
        for (; !done; ) {
            done = true;
        }

        // FOR-EACH -------------------------------------------------------------------
        // It's designed to cycle through a collection of objects such as an array

        // for(type itr-var: collection) statement block

        int[] nums = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : nums) sum += i;

        // Iterating over multidimensional arrays

        sum = 0;
        int[][] nums2 = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums2[i][j] = (i + 1) * (j + 1);
            }

            for (int[] x : nums2) {
                for (int y : x) {
                    System.out.println("Value is: " + y);
                    sum += y;
                }
            }
        }

    }
}
