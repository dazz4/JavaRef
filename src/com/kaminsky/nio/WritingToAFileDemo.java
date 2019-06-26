package com.kaminsky.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WritingToAFileDemo {
    public static void main(String[] args) {
        int c;
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Path.of("File1"), StandardOpenOption.WRITE, StandardOpenOption.APPEND)) {

            String s = "This should end up in a file";
            byte[] array = s.getBytes();
            ByteBuffer bb = ByteBuffer.allocate(1000);
            bb.put(array);
            bb.rewind();

            fChan.write(bb);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
