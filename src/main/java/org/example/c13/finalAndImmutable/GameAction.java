package org.example.c13.finalAndImmutable;

import java.util.function.Predicate;

public record GameAction(char key, String prompt, Predicate<Integer> action) {
}