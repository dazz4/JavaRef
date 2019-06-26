package com.kaminsky.generics;

class GenA {
    int a;

    GenA(int a ) {
        this.a = a;
    }

}

class GenB extends GenA {
    int b;

    GenB(int a, int b) {
        super(a);
        this.b = b;
    }
}

class GenC extends GenB {
    int c;

    GenC(int a, int b, int c) {
        super(a,b);
        this.c = c;
    }
}


class Bind<T extends GenA> {
    T ob;
    Bind(T ob) {
        this.ob = ob;
    }
}

public class GenPractice {

    static void showA(Bind <?> ob) {
        System.out.println(ob.ob.a);
    }

    static void showAB(Bind<? extends GenB> ob) {
        System.out.println(ob.ob.a + " " + ob.ob.b);
    }

    static void showABC(Bind<? extends GenC> ob) {
        System.out.println(ob.ob.a + " " + ob.ob.b + " " + ob.ob.c);
    }



    public static void main(String[] args) {

        GenA newGenA = new GenA(10);
        GenB newGenB = new GenB(10, 20);
        GenC newGenC = new GenC(10, 20, 30);

        Bind<GenA> bind1 = new Bind<>(newGenA);
        Bind<GenB> bind2 = new Bind<>(newGenB);
        Bind<GenC> bind3 = new Bind<>(newGenC);

        showA(bind1);
        showAB(bind2);
        showABC(bind3);

    }



}
