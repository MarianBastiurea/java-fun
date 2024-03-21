package org.example.c11lambdaexpression;

@FunctionalInterface
public interface Operation<T> {

    T operate(T value1, T value2);
}
