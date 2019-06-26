package com.kaminsky.multithread;

class Q2 {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}

class Producer2 implements Runnable {
    Q2 q2;

    Producer2(Q2 q2) {
        this.q2 = q2;
        new Thread(this, "Producer2").start();
    }

    @Override
    public void run() {
        int i = 0;

        while (true) q2.put(i++);

    }
}

class Consumer2 implements Runnable {
    Q2 q2;

    Consumer2(Q2 q2) {
        this.q2 = q2;
        new Thread(this, "Consumer2").start();
    }

    @Override
    public void run() {
        while(true) q2.get();
    }
}

public class InterthreadCommunicationGood {

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        new Producer2(q2);
        new Consumer2(q2);
    }
}
