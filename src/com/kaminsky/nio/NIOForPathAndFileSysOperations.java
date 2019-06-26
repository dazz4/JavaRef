package com.kaminsky.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class NIOForPathAndFileSysOperations {
    public static void main(String[] args) throws IOException {
        Path filepath = Path.of("File1");

        System.out.println("File name: " + filepath.getName(0));
        System.out.println("File path: " + filepath);
        System.out.println("Parent: " + filepath.getParent());
        System.out.println("Absolute path: " + filepath.toAbsolutePath());

        System.out.println("File isDirectory: " + Files.isDirectory(filepath));
        System.out.println("File exists: " + Files.exists(filepath));
        System.out.println("File isExecutable: " + Files.isExecutable(filepath));
        System.out.println("File isHidden: " + Files.isHidden(filepath));

        BasicFileAttributes bfa = Files.readAttributes(filepath, BasicFileAttributes.class);
        System.out.println("Creation time: " + bfa.creationTime());
        System.out.println("Last modified time: " + bfa.lastModifiedTime());
        System.out.println("Size: " + bfa.size());

    }
}
