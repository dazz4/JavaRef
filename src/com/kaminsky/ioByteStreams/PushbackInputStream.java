package com.kaminsky.ioByteStreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class PushbackInputStream {
    public static void main(String[] args) {
        String s = "if (4 == 0) a = 0;\n";
        String s2 = "HeloWorld";
        byte buf[] = s.getBytes();
        byte buf2[] = s2.getBytes();
        ByteArrayInputStream b = new ByteArrayInputStream(buf);
        ByteArrayInputStream b2 = new ByteArrayInputStream(buf2);
        int c;

        try (java.io.PushbackInputStream ps = new java.io.PushbackInputStream(b)) {
            while ((c = ps.read()) != -1) {
                switch (c) {
                    case '=':
                        if ((c = ps.read()) == '=') {
                            System.out.print(".eq.");
                        } else {
                            System.out.print("<-");
                            ps.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (java.io.PushbackInputStream ps = new java.io.PushbackInputStream(b2)) {


            c = ps.read();
            c = ps.read();
            c = ps.read();
            c = ps.read();
//          ps.unread(c); // next read() will be o not W
            c = ps.read();
            c = ps.read();
            c = ps.read();
            c = ps.read();
            c = ps.read();

            System.out.println((char)c);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
