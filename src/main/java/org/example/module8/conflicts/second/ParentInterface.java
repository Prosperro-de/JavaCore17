package org.example.module8.conflicts.second;

public interface ParentInterface {
    default void print() {
        System.out.println("Parent interface");
    }
}
