package com.kaminsky.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ReadingFileChannelDemo {
    public static void main(String[] args) {
        int count;

        try (SeekableByteChannel sbc = Files.newByteChannel(Path.of("File1"))) {

            ByteBuffer bb = ByteBuffer.allocate(128);

            do {
                count = sbc.read(bb);
                if (count != -1) {
                    bb.rewind();

                    for (int i = 0; i < count; i++) {
                        System.out.print((char) bb.get());
                    }
                }
            } while (count != -1);
            System.out.println();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }


    }
}
