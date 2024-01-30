package org.example.module9.generic.genericsort;

public class AnimalComparator <T extends Comparable<? super T>> {
    public boolean compare(T o1, T o2) {
        return o1.compareTo(o2) > 0;
    }
}
