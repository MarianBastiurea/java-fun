package org.example.c13.Final;

import java.util.function.Predicate;

public record GameAction(char key, String prompt, Predicate<Integer> action) {
}