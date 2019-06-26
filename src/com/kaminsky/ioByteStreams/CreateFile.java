package com.kaminsky.ioByteStreams;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {

    File file = new File("src/com/kaminsky/ioByteStreams/createFile.txt");
    file.createNewFile();

        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Canonical path: " + file.getCanonicalPath());
        System.out.println("getParent(): " + file.getParent());
        System.out.println("getPath(): " + file.getPath());
        System.out.println("length(): " + file.length());
        System.out.println("canExecute(): " + file.canExecute());
        System.out.println("isDirectory: " + file.isDirectory());
        System.out.println("lastModified: " + file.exists());
        System.out.println("lastModified: " + file.isAbsolute());

        File file2 = new File("Renamed");

        file.renameTo(file2);
    }
}
