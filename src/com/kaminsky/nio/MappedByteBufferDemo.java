package com.kaminsky.nio;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class MappedByteBufferDemo {
    public static void main(String[] args) {

        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Path.of("File1"))) {

            long fSize = fChan.size();

            MappedByteBuffer mbf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            for (int i = 0; i < fSize; i++) {
                System.out.print((char)mbf.get());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
