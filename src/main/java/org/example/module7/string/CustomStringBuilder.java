package org.example.module7.string;

import java.util.Arrays;

public class CustomStringBuilder {
    private static final int DEFAULT_SIZE = 10;
    private byte[] value;
    private int pointer;

    public CustomStringBuilder() {
        this.value = new byte[DEFAULT_SIZE];
    }

    public CustomStringBuilder(String input) {
        this.value = input.getBytes();
        pointer = input.length();
    }

    public CustomStringBuilder append(String input) {
        if (value.length < pointer + input.length()) {
            resizeValueArray(input.length());
        }
        int startIndex = pointer;
        byte[] bytes = input.getBytes();
        for (int i = startIndex; i < startIndex + input.length(); i++) {
            value[i] = bytes[i - startIndex];
            pointer++;
        }
        return this;
    }

    @Override
    public String toString() {
        byte[] result = Arrays.copyOf(value, pointer);
        return new String(result);
    }

    private void resizeValueArray(int minSize) {
        int increaseSize = value.length * 2;
        if (minSize > increaseSize) {
            value = Arrays.copyOf(value, minSize);
        } else {
            value = Arrays.copyOf(value, increaseSize);
        }
    }

//    public void print() {
//        System.out.println(Arrays.toString(value));
//        System.out.println(pointer);
//    }
}
