package org.example.module9.generic.genericsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {

        Integer[] intArray = {54, 32, 1, 43, 23, 5};
        SortUtil sortUtil = new SortUtil();
        sortUtil.mergeSort(intArray);
        System.out.println("intArray = " + Arrays.toString(intArray));


//        SortUtil<String> sortUtilForString = new SortUtil<>();
        String[] stringArray = {"t","d","a","m","e","i"};
        sortUtil.mergeSort(stringArray);
        System.out.println("stringArray = " + Arrays.toString(stringArray));

        List<Integer> integers = List.of(1, 4, 56, 23);
        print(integers);

        AnimalComparator<Animal> animalComparator = new AnimalComparator<>();
        Animal cat = new Cat(2);
        Animal dog = new Dog(5);
        System.out.println(animalComparator.compare(cat, dog));
    }

    public static void print(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    //PECS - producer extends consumer super
    public static void merge(List<? super Integer> destination, List<? extends Integer> source) {
        for (Integer element: source) {
            destination.add(element);
        }
    }
}
