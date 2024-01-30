package org.example.module9.generic;

import java.util.Collection;
import java.util.Objects;

public class CustomContainer <T> {
    public static final int DEFAULT_CAPACITY = 10;
    private T[] data;
    private int size;

    public CustomContainer() {
        this.data = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public CustomContainer(int size) {
        this.data = (T[]) new Object[size];
        this.size = 0;
    }

    public void add(T input) {
        if (size >= data.length) {
            // resize array +  length/2
        }
        data[size] = input;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
//        Objects.checkIndex(index,size);
        return data[index];
    }

    public int getSize() {
        return size;
    }
}
