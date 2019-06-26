package com.kaminsky.ioByteStreams;

import java.io.*;

public class DataIOStreamDemo {

    public static void main(String[] args) {

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("Test.dat"))) {

            dos.writeInt(9);
            dos.writeDouble(10.0);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("Test.dat"))) {

            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
