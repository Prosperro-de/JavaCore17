package org.example.module6.singleton;

public class Logger {
    private static Logger INSTANCE;
    private Logger() {
        System.out.println("Open stream to the local file");
    }

    public static Logger getInstance() {
         if (INSTANCE == null) {
             INSTANCE = new Logger();
             return INSTANCE;
         } else {
             return INSTANCE;
         }
    }
}
