package com.kaminsky.ioByteStreams;

import java.io.*;

public class ByteArrayOutputDemo {

    public static void main(String[] args) throws IOException {
        String abc = "abcdefghijklmnoprstowyz";
        byte alphabet[] = abc.getBytes();

        ByteArrayOutputStream baos = new ByteArrayOutputStream(alphabet.length);
        baos.write(alphabet);

        try (FileOutputStream file = new FileOutputStream("ByteArrayOutputDemo.txt")) {
            baos.writeTo(file);
        }

        try (FileInputStream file = new FileInputStream("ByteArrayOutputDemo.txt")){
            ByteArrayInputStream bais = new ByteArrayInputStream(file.readAllBytes());
            for (byte a : bais.readAllBytes()) {
                System.out.println((char)a);
            }
        }

    }

}
