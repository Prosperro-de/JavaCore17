package org.example.module10.serialize;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Mykola", "qwerty");
//        Task task = new Task(new Command("rm -f outputDemo.txt"));
//        serialize(task, "virus.bin");

//        serialize(user, "userCredentials.bin" );
//
        deserializeUser("virus.bin");


    }
    // log4j -> log4shell

    private static void deserializeUser(String filePath) {
        try (InputStream fIs = new FileInputStream(filePath);
             ObjectInputStream in = new ObjectInputStream(fIs)) {
            User user1 = (User) in.readObject();
            System.out.println("user1 = " + user1);
        } catch (IOException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static void serialize(Object object, String filePath) {
        try (OutputStream fOs = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(fOs)) {
            out.writeObject(object);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
