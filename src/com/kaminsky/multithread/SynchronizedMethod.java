package com.kaminsky.multithread;

class Callme {

    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.print("]");
    }

}

class Caller implements Runnable {

    // changing the order of the instance variable will change the output
    Callme target;
    String msg;
    Thread t;

    Caller(Callme target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(this.msg);
    }
}

class Synth {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "hello");
        Caller ob2 = new Caller(target, "sync");
        Caller ob3 = new Caller(target, "world");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted.");
        }

    }
}
