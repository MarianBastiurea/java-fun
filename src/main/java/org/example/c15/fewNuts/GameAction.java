package org.example.c15.fewNuts;

import java.util.function.Predicate;

public record GameAction(char key, String prompt, Predicate<Integer> action) {
}

