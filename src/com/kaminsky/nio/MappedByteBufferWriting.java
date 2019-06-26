package com.kaminsky.nio;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class MappedByteBufferWriting {
    public static void main(String[] args) {

        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Path.of("File1"),
                StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE)) {

            String s = "This should end up in a file";
            byte[] array = s.getBytes();

            MappedByteBuffer mbb = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 1000);
            mbb.put(array);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
