package com.kaminsky.lambda;

interface StringFunc {
    String func(String n);
}

class MyStirngOps {

    static String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--) result += str.charAt(i);
        return result;
    }

}

class MethodReference {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Test string";
        String outStr;

        // Method reference to a static method
        // General syntax: ClassName::methodName
        outStr = stringOp(MyStirngOps::strReverse, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reversed: " + outStr);
    }
}
