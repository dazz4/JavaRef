package com.kaminsky.multithread;

public class MainThread {

    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        mainThread.setName("Main Thread");
        mainThread.setPriority(1);

        System.out.println("Name: " + mainThread.getName() + ", Priority: " + mainThread.getPriority() +
                ", Is alive: " + mainThread.isAlive());

        try {
            for (int i = 5; i > 0; --i) {
                System.out.println(i);
                mainThread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted" + e.getMessage());
        }
    }
}


