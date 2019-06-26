package com.kaminsky.multithread;

public class SuspendResumeAndStop implements Runnable {

    String name;
    Thread t;
    boolean suspendFlag;

    SuspendResumeAndStop(String name) {
        this.name = name;
        t = new Thread(this, this.name);
        System.out.println("New thread " + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(this.name = ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(name + " exiting.");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}

class suspendResume {
    public static void main(String[] args) {
        SuspendResumeAndStop ob1 = new SuspendResumeAndStop("one");
        SuspendResumeAndStop ob2 = new SuspendResumeAndStop("two");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Suspending thread one");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resuming thread One");

            ob2.mysuspend();
            System.out.println("Suspending thread two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Resuming thread two");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Waiting for threads to finish");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main thread exiting.");
    }
}
