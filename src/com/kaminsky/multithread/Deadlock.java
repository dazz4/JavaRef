package com.kaminsky.multithread;

class N {

    synchronized void foo(M m) {

        String name = Thread.currentThread().getName();
        System.out.println(name + " entered N.foo");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(name + "trying to call M.last()");
        m.last();
    }

    synchronized void last() {
        System.out.println("Inside N.last");
    }

}

class M{

    synchronized void bar(N n) {

        String name = Thread.currentThread().getName();
        System.out.println(name + " entered M.foo");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(name + "trying to call N.last()");
        n.last();
    }

    synchronized void last() {
        System.out.println("Inside M.last");
    }

}

public class Deadlock implements Runnable {

    N n = new N();
    M m = new M();

    Deadlock() {
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RacingThread");
        t.start();

        n.foo(m);
        System.out.println("Back in the main thread");
    }

    @Override
    public void run() {
        m.bar(n);
        System.out.println("Back in the other thread");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
