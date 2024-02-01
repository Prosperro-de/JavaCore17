package org.example.module9.generic;

import java.util.*;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
//        CustomContainer<Integer> customIntegerContainer = new CustomContainer<>();
//        customIntegerContainer.add(10);
//        customIntegerContainer.add(20);
//        customIntegerContainer.add(30);
////        customIntegerContainer.forEach(System.out::println);
//        for (int i = 0; i < customIntegerContainer.getSize(); i++) {
//            System.out.println(customIntegerContainer.get(i) * 2);
//        }
//
//        CustomContainer<String> stringCustomContainer = new CustomContainer<>();
//        stringCustomContainer.add("Hello");
//        stringCustomContainer.add("World");
//
//        for (int i = 0; i < stringCustomContainer.getSize(); i++) {
//            System.out.println(stringCustomContainer.get(i));
//        }
//        List<Integer> intList = new ArrayList<>();
//        intList.add(1);
//        intList.add(2);
//        intList.add(3);
//        Iterator<Integer> iterator = intList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        List<Integer> integers = List.of(1, 3, 4, 5);
//
//        LinkedContainer<Integer> linkedContainer = new LinkedContainer<>();
//        linkedContainer.add(4);
//        linkedContainer.add(24);
//        linkedContainer.add(6);
//        linkedContainer.add(14);
//        linkedContainer.add(10);
//        for (int i = 0; i < linkedContainer.getSize(); i++) {
//            System.out.println(linkedContainer.get(i));
//        }

//        Set<Integer> integerSet = new HashSet<>();
//        integerSet.add(1);
//        integerSet.add(2);
//        integerSet.add(3);
//        integerSet.add(2);
//        integerSet.add(4);
//        integerSet.add(5);
//        for (Integer integer : integerSet) {
//            System.out.println(integer);
//        }
//        Map<String, Map<String, List<List<String>>>> demoMap = new HashMap<>();
//        Map<String, String> demoMap = new HashMap<>();
//        demoMap.put("Hello", "World");
//        demoMap.put("Hi", "There");
//        demoMap.put("Hey", "Everyone");
//        demoMap.put(null, "null value");
//
//        for (Map.Entry<String, String> entry : demoMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//            System.out.println("---------------------------");
//        }
//        System.out.println(demoMap.get(null));

//        Student mykola = new Student("Mykola", 21);
//        Student oleg = new Student("Oleg", 19);
//        Student stepan = new Student("Stepan", 22);
//
//        Map<Student, Integer> studentMap = new HashMap<>();
//        studentMap.put(mykola, 90);
//        studentMap.put(oleg, 85);
//        studentMap.put(stepan, 95);
//        System.out.println("mykola.hashCode() = " + mykola.hashCode());
//
//
//        for (Map.Entry<Student, Integer> entry : studentMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//            System.out.println("---------------------------");
//        }
//
//        mykola.setAge(22);
//        System.out.println("mykola.hashCode() = " + mykola.hashCode());
//
//        System.out.println(studentMap.get(mykola));

//        String result = demoMap.get("Hello");
//        System.out.println("result = " + result);

        MapContainer<String, String> mapContainer = new MapContainer<>();
        mapContainer.put("hello", "World");
        mapContainer.put("hi", "everyone");

        System.out.println(mapContainer.get("hello"));
        System.out.println(mapContainer.get("hi"));

    }



    public <T> Stream<T> method(List<T> s) {
        return s.stream();
    }
}
