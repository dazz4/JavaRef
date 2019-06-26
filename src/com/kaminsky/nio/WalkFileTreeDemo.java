package com.kaminsky.nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println(file);
        return FileVisitResult.SKIP_SUBTREE;
    }
}

public class WalkFileTreeDemo {
    public static void main(String[] args) {

        Path p = Path.of("C:\\Users\\kamin\\IdeaProjects\\JavaReference\\src\\com\\kaminsky\\nio");

        try {

            Files.walkFileTree(p, new MyFileVisitor());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
