package org.example.c11.LambdaExpression;

import java.util.*;
import java.util.function.Consumer;

public class LambdaExercise1 {
    public static void main(String[] args) {

        // initial
        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };


        // using lambda expression
        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        Consumer<String> printWordsForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };
        Consumer<String> printWordsConcise = sentence -> {

            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };


        printTheParts.accept("alpha beta charlie delta");
        printWordsLambda.accept("alpha beta charlie");
        printWordsForEach.accept("alpha beta charlie delta foxtrot");
        printWordsConcise.accept("alpha beta charlie");
    }
}
