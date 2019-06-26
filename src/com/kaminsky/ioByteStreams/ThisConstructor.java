package com.kaminsky.ioByteStreams;

public class ThisConstructor {

    int a,b;
    
    ThisConstructor(int i, int j) {
        a = i;
        b = j;
    }

    ThisConstructor(int i) {
        this(i, i);
    }

    ThisConstructor() {
        this(0);
    }

    public static void main(String[] args) {
        ThisConstructor thisConstructor = new ThisConstructor(1,2);
        System.out.println(thisConstructor.a + " " + thisConstructor.b);
    }
    
}
