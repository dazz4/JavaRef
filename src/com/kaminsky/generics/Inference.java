package com.kaminsky.generics;

class Inference<T, V> {

    T ob1;
    V ob2;

    Inference(T o, V o2) {
        ob1 = o;
        ob2 = o2;
    }

    boolean isSame(Inference<T, V> o) {

        if (ob1 == o.ob1 && ob2 == o.ob2) return true;
        return false;
    }

    public static void main(String[] args) {


        // NO INFERENCE
        Inference<Integer, String> ob1 = new Inference<Integer, String>(1, "test");
        // USING INFERENCE
        Inference<Integer, String> ob2 = new Inference<>(99, "Test string2");
        // Local variable type inference
        var ob3 = new Inference<Integer, String>(22, "test");

        if(ob1.isSame(new Inference<>(1, "test"))) System.out.println("same");

    }

}
