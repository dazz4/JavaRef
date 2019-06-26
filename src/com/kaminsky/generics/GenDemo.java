package com.kaminsky.generics;

class Gen<T> {
    T ob;

    Gen(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return this.ob;
    }
}

public class GenDemo {

    public static void main(String[] args) {

        String text = "Hello World";
        Gen<String> newStr = new Gen<>(text);
        System.out.println(newStr.getOb());

        Integer numer = 100;
        Gen<Integer> newInt = new Gen<>(numer);
        System.out.println(newInt.getOb());

    }


}
