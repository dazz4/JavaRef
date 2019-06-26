package com.kaminsky.ioByteStreams;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

class Filterme implements FilenameFilter {

    String ext;

    Filterme(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

public class Directories {

    public static void main(String[] args) throws IOException {
        File dir = new File("/");

        System.out.println("Directory without the filter:");
        if (dir.isDirectory()) {
            for (String s : dir.list()) {
                System.out.println(s);
            }
        }
        System.out.println();
        System.out.println("Directory with the filter:");
        FilenameFilter only = new Filterme("sys");
        String s[] = dir.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        // FilenameFilter is a functional interface so we can use lambda
        System.out.println();
        System.out.println("Directory with the filter while using lambda:");
        FilenameFilter only2 = (folder, name) -> name.endsWith("sys"); // lambda expression
        String s2[] = dir.list(only2);

        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }

        // You can also use methods: listFiles(), listFiles(FilenameFilter FFObj), listFiles(FileFilter Fobj)

        File[] fileList;
        fileList = dir.listFiles();
        System.out.println();
        System.out.println("Using listFiles()");
        for (File f : fileList) {
            System.out.println(f);
        }

        fileList = dir.listFiles(only);
        System.out.println();
        System.out.println("Using listFiles(FilanameFilter FFObj)");
        for (File f : fileList) {
            System.out.println(f);
        }

        // CREATING NEW DIRECTORY

        File newDir = new File("/test");
        File newFile = new File("/test/test.txt");

        if (newDir.mkdir()) {
            System.out.println("Directory was created:");
            newFile.createNewFile();
            for (String ss : newDir.list()) {
                System.out.println(ss);
            }
        }

    }
}
