package org.example.module8.conflicts.second;

public interface SecondChildInterface extends ParentInterface {
    @Override
    default void print() {
        System.out.println("Second child interface");
    }
}
