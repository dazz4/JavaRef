package com.kaminsky.ioByteStreams;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

    public static void main(String[] args) throws IOException {

        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";

        byte a[] = s.getBytes();

        ByteArrayInputStream bais = new ByteArrayInputStream(a);
        BufferedInputStream bis = new BufferedInputStream(bais);
        int c;
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        bis.mark(3);
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println();

        bis.reset();
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());


    }

}


