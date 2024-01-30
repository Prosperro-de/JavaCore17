package org.example.module9.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        CustomContainer<Integer> customIntegerContainer = new CustomContainer<>();
        customIntegerContainer.add(10);
        customIntegerContainer.add(20);
        customIntegerContainer.add(30);
        for (int i = 0; i < customIntegerContainer.getSize(); i++) {
            System.out.println(customIntegerContainer.get(i) * 2);
        }

        CustomContainer<String> stringCustomContainer = new CustomContainer<>();
        stringCustomContainer.add("Hello");
        stringCustomContainer.add("World");

        for (int i = 0; i < stringCustomContainer.getSize(); i++) {
            System.out.println(stringCustomContainer.get(i));
        }
    }



    public <T> Stream<T> method(List<T> s) {
        return s.stream();
    }
}
