package org.example.module10.serialize;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Command implements Serializable, Runnable {
    private String command;

    public Command(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        try {
            Process process = Runtime.getRuntime().exec(command);
            Scanner scanner = new Scanner(process.getInputStream());
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
