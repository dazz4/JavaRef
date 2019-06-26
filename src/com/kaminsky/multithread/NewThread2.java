package com.kaminsky.multithread;

/* CREATING A THREAD BY EXTENDING Thread */

class NewThread2 extends Thread {

    // Create a new second thread
    NewThread2() {
        super("Demo Thread"); // call to Thread constructor
        System.out.println("Child thread: " + this);
        start(); // start the thread
    }

    // This is the entry point for the second thread
    public void run() {
        try {

            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread interrupted");
        }
        System.out.println("Exiting the Child thread.");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        new NewThread2();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Exiting Main Thread");
    }
}
