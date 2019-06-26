package com.kaminsky.multithread;

public class Multihread {


    public static void main(String[] args) {

        Thread newThread = Thread.currentThread();
        System.out.println("Current thread: " + newThread);

        // change the name of the threat
        newThread.setName("My thread");
        System.out.println("After name change: " + newThread);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
                System.out.println("Main thread interrputed");
            }
        }
}

