package org.example.c11.lambdaExpression;

@FunctionalInterface
public interface Operation<T> {

    T operate(T value1, T value2);
}
