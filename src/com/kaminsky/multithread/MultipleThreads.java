package com.kaminsky.multithread;


class MultiThread implements Runnable {
    private String name; // name of the thread
    Thread t;

    MultiThread(String threadname) {
        name = threadname;
        t = new Thread(this, threadname);
        System.out.println("New thread" + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " Exiting");
    }
}

public class MultipleThreads {

    public static void main(String[] args) {
        MultiThread ob1 = new MultiThread("One");
        MultiThread ob2 = new MultiThread("Two");
        MultiThread ob3 = new MultiThread("Three");

        ob2.t.setPriority(1);
        System.out.println(ob2.t);

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();

        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Exiting main thread.");
    }

}
