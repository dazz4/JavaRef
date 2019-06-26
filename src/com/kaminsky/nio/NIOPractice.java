package com.kaminsky.nio;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;

public class NIOPractice {

    public static void main(String[] args) {

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Path.of("C:\\Users\\kamin\\IdeaProjects"))) {
            for (Path entry : directoryStream) {
                BasicFileAttributes attrs = Files.readAttributes(entry, BasicFileAttributes.class);
                for (int i = 0; i < entry.getNameCount(); i++)
                System.out.println(entry.getName(i));
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
