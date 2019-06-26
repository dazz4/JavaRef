package com.kaminsky.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyingAFileDemo {
    public static void main(String[] args) {

        try {
            Path source = Path.of("File1");
            Path target = Path.of("File2");

            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
