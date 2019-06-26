package com.kaminsky.ioCharStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading characters
        char c;
        c = (char) br.read();
        System.out.println(c);

        // Reading Strings
        String str;

        do {
            str = br.readLine();
            System.out.println(str);

        }
        while (!str.equals("stop"));

    }
}

