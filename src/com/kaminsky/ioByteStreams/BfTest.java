package com.kaminsky.ioByteStreams;

import java.io.*;

public class BfTest {

    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(System.out, true);

        int a = 'A';
        System.out.write(a);

        pw.println('\n');
        pw.println("Test");
    }
}
