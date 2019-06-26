package com.kaminsky.generics;

// Bounded types class
class GenClass<T extends Number, V> {
    T ot;

    V ov;

    GenClass(T t, V v) {
        ot = t;
        ov = v;
    }

    T getOt() {
        return ot;
    }

    V getOv() {
        return ov;
    }
}


public class BoundedTypes {

    public static void main(String[] args) {

        GenClass<Integer, String> genClass = new GenClass<>(100, "Test String");
        System.out.println("T is an Integer and it can be only a subclass of Number class: " + genClass.getOt());
        System.out.println("V is a String and it can be of any type: " + genClass.getOv());
        System.out.println("You can use methods from the extended class " + genClass.ot.doubleValue());
    }


}
