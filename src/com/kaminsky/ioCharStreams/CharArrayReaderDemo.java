package com.kaminsky.ioCharStreams;

import java.io.CharArrayReader;

import java.io.IOException;

public class CharArrayReaderDemo {
    public static void main(String[] args) {

        String s = "This should end up in a stream";
        char[] buff = new char[s.length()];

        s.getChars(0, s.length(), buff, 0);
        int i;

        try (CharArrayReader charray = new CharArrayReader(buff)) {
            while ((i = charray.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
