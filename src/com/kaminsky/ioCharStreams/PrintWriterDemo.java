package com.kaminsky.ioCharStreams;

import java.io.PrintWriter;

public class PrintWriterDemo {

    public static void main(String[] args) {

    int b;
    b = 'A';
    System.out.write(b);
    System.out.write('\n');

    // The PrintWriter Class

    PrintWriter pw = new PrintWriter(System.out, true);
    pw.println("Test");

    }
}
