package com.kaminsky.generics;

class A<T> {
    T obA;

    A(T o) {
        obA = o;
    }

}

class B<T> extends A<T> {

    T obB;

    B(T o) {
        super(o);
        obB = o;
    }
}

public class GenericInstanceOf {

    public static void main(String[] args) {
        A<Integer> oba = new A<>(100);
        B<Integer> obb = new B<>(99);

        A<String> obaString = new A<>("Test string");

        if(oba instanceof A<?>) System.out.println("oba is an instance of A");
        if(obaString instanceof A<?>) System.out.println("obaString is and instance of A"); // it is even though it's a String
        if(oba instanceof B<?>) System.out.println("oba is an instance of B"); // it is not

        if(obb instanceof A<?>) System.out.println("obb is an instance of A");
        if(obb instanceof B<?>) System.out.println("obb is an instance of B");
    }
}
