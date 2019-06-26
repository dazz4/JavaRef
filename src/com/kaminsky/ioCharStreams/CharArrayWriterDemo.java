package com.kaminsky.ioCharStreams;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) throws IOException {
        CharArrayWriter f = new CharArrayWriter();
        String s = "new string";
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Buffer as as string");
        System.out.println(f.toString());
        System.out.println();
        System.out.println("Into array ");

        char c[] = f.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }

        try (FileWriter fw = new FileWriter("CharArrayWriterDemo.txt")) {
            f.writeTo(fw);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
