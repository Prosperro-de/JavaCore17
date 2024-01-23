package org.example.module8.conflicts.third;

public interface ParentInterface {
    default void print() {
        System.out.println("Parent interface");
    }
}
