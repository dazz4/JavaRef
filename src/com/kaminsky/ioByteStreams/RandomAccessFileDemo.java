package com.kaminsky.ioByteStreams;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) {

        try (RandomAccessFile raf = new RandomAccessFile("Test.dat", "rw")) {

            raf.seek(4); // skips the first int value which has 4 bytes
            double d = raf.readDouble();
            System.out.println(d);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
