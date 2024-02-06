package org.example.module10.iostream;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) throws IOException {
        InputStream customInputStream = new CustomStringInputStream("Hello from custom input stream");
//        while (customInputStream.available() > 0) {
//            char ch = (char)customInputStream.read();
//            System.out.print(ch);
//        }
//        Scanner scanner = new Scanner(customInputStream);
//        String result = scanner.nextLine();
//        System.out.println("result = " + result);
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String buffReadResult = bufferedReader.readLine();
//        System.out.println("buffReadResult = " + buffReadResult);

//        File file = new File("files/demo.txt");
//        if (file.exists()) {
//            //try-with-resources
//            try (FileInputStream fIs = new FileInputStream(file);
//                 Scanner fileScanner = new Scanner(fIs)) {
//                while (fileScanner.hasNext()) {
//                    System.out.println(fileScanner.nextLine());
//                }
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        } else {
//            System.out.println("File was not found");
//        }

        //________________________

//        try (FileOutputStream fileOutputStream = new FileOutputStream("outputDemo.txt");
//             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream))) {
//            String message = "new line in new file";
//            bufferedWriter.write(message);
//        }

        FileOutputStream fileOutputStream = new FileOutputStream("outputDemo.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
        String message = "One more Message for writing\n";
        bufferedWriter.write(message);

//        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
