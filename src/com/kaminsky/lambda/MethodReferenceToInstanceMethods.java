package com.kaminsky.lambda;

interface StringFunc2 {
    String func(String n);
}

class MyStirngOps2 {
    String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--) result += str.charAt(i);
        return result;
    }
}

class MethodReferenceToInstanceMethods {
    static String stringOp(StringFunc2 sf, String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Test string";
        String outStr;

        // Create a MyStringOps2 object
        MyStirngOps2 strOps = new MyStirngOps2();

        // Now, a method reference to the instance method strReverse is passed to stringOp()
        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reversed: " + outStr);
    }
}
