package com.kaminsky.ioCharStreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {

        String s = "Jakis tam sobie text";
        char buffer[] = new char[s.length()];
        s.getChars(0, s.length(), buffer, 0);

        // First we gonna write something into a file
        try (FileWriter fw = new FileWriter("filewriter", true)) {

            fw.write(buffer);
            fw.append("Darek");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Now we gonna read it back
        int c;
        try (FileReader fr = new FileReader("filewriter")) {

            while ((c = fr.read()) != -1) {
                System.out.print((char)c);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
