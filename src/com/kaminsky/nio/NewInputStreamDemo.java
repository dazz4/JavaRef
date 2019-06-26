package com.kaminsky.nio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NewInputStreamDemo {
    public static void main(String[] args) {

        int c;

        try (OutputStream os = new BufferedOutputStream(Files.newOutputStream(Path.of("File1"), StandardOpenOption.APPEND))) {

            for (int i = 0; i < 26; i++) {
                os.write((byte)('A' + i));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // try (InputStream is = new BufferedInputStream(Files.newInputStream(Path.of("File1"), StandardOpenOption.READ))) {

        try (InputStream is = Files.newInputStream(Path.of("File1"), StandardOpenOption.READ)) {

            while ((c = is.read()) != -1) {
                System.out.print((char)c);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
