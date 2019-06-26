package com.kaminsky.exceptionHandling;

public class ThrowsDemo {

/** If we know that the method will cause an exception we must use Throws and
 * tell the compile what exception method might throw.
 */

/*  This code will not compile because we do not handle the exception.

    static void throwOne() {
        System.out.println("Inside throwOne");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        throwOne();
    }
*/
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne");
        throw new IllegalAccessException("demo");
    }

    // you have to use try/catch to handle exception if you know that the method will cause it
    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }

    }
}
