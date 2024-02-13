package org.example.module11.lambda;

@FunctionalInterface
public interface Validator<T> {
    boolean validate(T elemet);
}
