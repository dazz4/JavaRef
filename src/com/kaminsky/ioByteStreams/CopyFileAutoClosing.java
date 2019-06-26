package com.kaminsky.ioByteStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileAutoClosing {
    public static void main(String[] args) throws IOException {

        int i;

        // you can use var
        // try (var fin = new FileInputStream("File1")) { ... }
        try (FileInputStream fin = new FileInputStream("File1");
             FileOutputStream fout = new FileOutputStream("File2")) {

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
            System.out.println(fin.getClass());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

