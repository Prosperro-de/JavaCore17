package org.example.module8.conflicts.third;

public interface SecondChildInterface extends ParentInterface {
    @Override
    default void print() {
        System.out.println("Second child interface");
    }
}
