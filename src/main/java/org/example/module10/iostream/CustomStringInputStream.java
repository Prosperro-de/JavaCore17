package org.example.module10.iostream;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public class CustomStringInputStream extends InputStream {
    private Queue<Byte> bytesQueue = new ArrayDeque<>();

    public CustomStringInputStream(String input) {
        byte[] bytes = input.getBytes();
        for (byte element : bytes) {
            bytesQueue.add(element);
        }
    }

    @Override
    public int read() throws IOException {
        if (available() > 0) {
            return bytesQueue.poll();
        }
        return -1;
    }

    @Override
    public int available() throws IOException {
        return bytesQueue.size();
    }
}
