package com.kaminsky.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class ListDirectory {
    public static void main(String[] args) {
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(Path.of("\\"), "*.sys")) {

            for (Path entry : ds) {
                BasicFileAttributes bfa = Files.readAttributes(entry, BasicFileAttributes.class);

                if (bfa.isDirectory()) {
                    System.out.print("<DIR>");
                } else System.out.println("      ");

                System.out.println(entry.getName(0));
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
