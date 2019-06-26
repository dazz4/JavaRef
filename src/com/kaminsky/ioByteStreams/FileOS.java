package com.kaminsky.ioByteStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOS {

    public static void main(String[] args) {

        try (FileOutputStream of = new FileOutputStream("File2")) {

            String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit\n";
            byte[] ofa = text.getBytes();

            of.write(ofa, 0, ofa.length/2 );

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
