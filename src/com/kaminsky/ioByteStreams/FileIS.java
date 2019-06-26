package com.kaminsky.ioByteStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileIS{

    public static void main(String[] args) throws IOException {

        try (FileInputStream f = new FileInputStream("File1")) {
            int size;
            System.out.println("Bytes available: " + (size = f.available()));

            int n = size/40;
            System.out.println();
            System.out.println("First " + n + " bytes of the stream.\n");
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }
            System.out.println("\n\nStill available: " + f.available());

            System.out.println("\nReading the next " + n + " with one read(b[])");
            byte b[] = new byte[n];
            if (f.read(b) != n) {
                System.out.println("couldn't read " + n + " bytes.");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("\nStill Available: " + f.available());

            System.out.println("Skipping half of the reamaing bytes with skip()");
            f.skip(size / 2);
            System.out.println("Still available: " + f.available());

            if (f.read(b, n / 2, n / 2) != n / 2) {
                System.out.println("couldn't read " + n/2 + " bytes");
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println("Still available: " + f.available());
        }

    }

}
