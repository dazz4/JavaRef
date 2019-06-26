package com.kaminsky.basics;

public class Operators {

    public static void main(String[] args) {

        //        Four groups of operators: arithmetic, bitwise, relational, logical.
        //        The operands of the arithmetic operators must be of a numeric type.
        //        You cannot use them on boolean types, but you can use them on char types,
        //        since the char type in Java is, essentially, a subset of int.

        int o, p, t;
        o = p = t = 100; // sets all of the variables to 100

        int x = 42;
        int y = ++x;
        // x = x +1;
        // y = x
        System.out.println("Prefix increment: " + y);

        int b = 42;
        int c = b++;
        // c = b;
        // b = b +1;
        System.out.println("Postfix increment: " + c);

        // Bitwise Logical Operators

        String[] binary = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };

        int a = 3; // 0 + 2 + 1 or 0011 in binary
        b = 6; // 4 + 2 + 0 or 0110 in binary
         c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) |(a & ~b);
        int g = ~a & 0x0f;

        System.out.println("        a = " + binary[a]);
        System.out.println("        b = " + binary[b]);
        System.out.println("      a|b = " + binary[c]);
        System.out.println("      a&b = " + binary[d]);
        System.out.println("      a^b = " + binary[e]);
        System.out.println("~a&b|a&~b = " + binary[f]);
        System.out.println("       ~a = " + binary[g]);

        // Left shift operator <<
        // value << num (num specifies the number of positions to left-shift)

        byte q = 64, w;
        int r;
        r = q << 2;
        w = (byte) (q << 2);

        System.out.println("\nOriginal value of r: " + r);
        System.out.println("r and w: " + r + " " + w);

        // The ? Operator
        // expression1 ? expression2 : expression3

        int m, n;
        m = -10;
        n = m < 0 ? -m : m; // get absolute value of m
        System.out.print("Absolute value of ");
        System.out.println(m + " is " + n);


    }

}
