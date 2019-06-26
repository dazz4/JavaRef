package com.kaminsky.interfacedemo;

interface DefaultMethod {

    default void remove() {
        System.out.println("remove() method");
    }

    // example of a static method
    static void getStirng() {
        System.out.println("static getString() method");
    }
}

class test implements DefaultMethod {
    public static void main(String[] args) {

        DefaultMethod newInt = new test();
        newInt.remove();

        DefaultMethod.getStirng();

    }
}
