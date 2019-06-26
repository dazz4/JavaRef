package com.kaminsky.interfacedemo;

interface A {
    void meth1();
    void meth2();
}

interface B extends A {
    void meth3();
}

class Extending implements B{

    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println("meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }
}

public class InterfaceExtending {

    public static void main(String[] args) {
        Extending ob = new Extending();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }



}
