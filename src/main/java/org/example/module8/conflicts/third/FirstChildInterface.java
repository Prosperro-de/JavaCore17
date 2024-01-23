package org.example.module8.conflicts.third;

public interface FirstChildInterface extends ParentInterface {
    @Override
    default void print() {
        System.out.println("First child interface");
    }
}
