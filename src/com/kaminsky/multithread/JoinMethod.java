package com.kaminsky.multithread;

public class JoinMethod implements Runnable {
    Thread t;

    JoinMethod(String name) {
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Running the thread " + t.getName());
        t.setPriority(1);
    }

    public static void main(String[] args) {
        JoinMethod newThread1 = new JoinMethod("Darek");
        JoinMethod newThread2 = new JoinMethod("Kasia");
        JoinMethod newThread3 = new JoinMethod("Dawid");

        System.out.println(newThread1.t.getName() + " isAlive: " + newThread1.t.isAlive());
        System.out.println(newThread2.t.getName() + " isAlive: " + newThread2.t.isAlive());
        System.out.println(newThread3.t.getName() + " isAlive: " + newThread3.t.isAlive());


        try {
            newThread3.t.sleep(1000);
            newThread1.t.join(1000);
            newThread2.t.join(1000);


        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted" + e.getMessage());
        }



        System.out.println(newThread1.t.getName() + " isAlive: " + newThread1.t.isAlive());
        System.out.println(newThread2.t.getName() + " isAlive: " + newThread2.t.isAlive());
        System.out.println(newThread3.t.getName() + " isAlive: " + newThread3.t.isAlive());

    }
}
