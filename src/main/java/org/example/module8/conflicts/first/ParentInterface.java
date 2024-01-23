package org.example.module8.conflicts.first;

public interface ParentInterface {
    default void doSomething() {
        System.out.println("Interface implementation");
    }
}
