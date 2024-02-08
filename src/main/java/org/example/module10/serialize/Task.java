package org.example.module10.serialize;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serial;
import java.io.Serializable;

public class Task implements Serializable {
    private Runnable command;

    public Task(Runnable command) {
        this.command = command;
    }

    private void readObject(ObjectInputStream in) {
        try {
            in.defaultReadObject();
            command.run();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
