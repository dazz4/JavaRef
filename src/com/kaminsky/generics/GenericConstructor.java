package com.kaminsky.generics;

class GenericConstructor {

    private double val;

    // You can create a generic constructor without class being generic
    <T extends Number> GenericConstructor(T arg) {
        val = arg.doubleValue();
    }

    void showval() {
        System.out.println("val: " + val);
    }

}

class GenConsDemo {
    public static void main(String[] args) {
        GenericConstructor test = new GenericConstructor(100);
        GenericConstructor test2 = new GenericConstructor(123.5F);

        test.showval();
        test2.showval();
    }
}
