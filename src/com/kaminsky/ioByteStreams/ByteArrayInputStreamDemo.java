package com.kaminsky.ioByteStreams;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {

        String abc = "abcdefghijklmnoprstowyz";
        byte alphabet[] = abc.getBytes();

        ByteArrayInputStream bais = new ByteArrayInputStream(alphabet);

        for (int i = 0; i < alphabet.length; i++) {
            System.out.println((char) bais.read());
            if (i == 5) {
                System.out.println();
                bais.reset();
                            }
        }

        System.out.println();
        ByteArrayInputStream bais2 = new ByteArrayInputStream(alphabet, 4, 8);
        for (byte c : bais2.readAllBytes()) {
            System.out.println((char)c);
        }

    }
}
