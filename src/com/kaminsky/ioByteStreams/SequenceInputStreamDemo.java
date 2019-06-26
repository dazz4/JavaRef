package com.kaminsky.ioByteStreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {

    public static void main(String[] args) {

        String hello = "Hello";
        String world = "World";
        byte h[] = hello.getBytes();
        byte w[] = world.getBytes();
        int c;


        ByteArrayInputStream bh = new ByteArrayInputStream(h);
        ByteArrayInputStream wh = new ByteArrayInputStream(w);

        try (SequenceInputStream sq = new SequenceInputStream(bh, wh)) {
            while ((c = sq.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
