package org.example.c11.LambdaExpression;

@FunctionalInterface
public interface Operation<T> {

    T operate(T value1, T value2);
}
