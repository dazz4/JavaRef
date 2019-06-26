package com.kaminsky.multithread;

class ThreadD extends Thread {

    ThreadD(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println("This is a ThreadD.");
    }
}

public class TestThread implements Runnable {

    Thread t;

    TestThread() {
        t = new Thread(this, "Second Thread");
        t.start();
    }

    @Override
    public void run() {
        System.out.println("This is a TestThread");
    }

    public static void main(String[] args) {

        Runnable t1 = new TestThread();
        Runnable t2 = new TestThread();



        ThreadD threadD1 = new ThreadD("Thread D 1");
        Thread threadD2 = new ThreadD("Thread D 2");

        System.out.println(threadD1);
        System.out.println(threadD2);

    }
}
