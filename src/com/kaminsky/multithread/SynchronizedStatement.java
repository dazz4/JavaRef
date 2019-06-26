package com.kaminsky.multithread;

class Callme2 {

    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.print("]");
    }

}

class Caller2 implements Runnable {

    // changing the order of the instance variable will change the output
    Callme2 target;
    String msg;
    Thread t;

    Caller2(Callme2 target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }


    @Override
    public void run() {

        // Synchronized statement! -----------------------------
        synchronized (target) {
            target.call(msg);
        }
        // Synchronized statement! -----------------------------

    }
}

class Synth2 {
    public static void main(String[] args) {
        Callme2 target = new Callme2();
        Caller2 ob1 = new Caller2(target, "hello");
        Caller2 ob2 = new Caller2(target, "sync");
        Caller2 ob3 = new Caller2(target, "world");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted.");
        }

    }
}
