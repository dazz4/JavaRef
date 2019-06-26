package com.kaminsky.interfacedemo;

public interface IntStack {
    void push(int item); // store and item
    int pop(); // retrieve an item

    default void clear() {
        System.out.println("clear() clear not implemented");
    }

}
