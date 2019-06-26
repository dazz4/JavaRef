package com.kaminsky.ioByteStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingAndWritingFiles {

    public static void main(String[] args) {
        int i;
        FileInputStream file = null;
        try {
            file = new FileInputStream("ReadingAndWritingFiles");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            do {
                i = file.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                file.close();
            } catch (IOException g) {
                System.out.println(g.getMessage());
            }
        }
    }
}
