package org.example.c15fewnuts;

import java.util.function.Predicate;

public record GameAction(char key, String prompt, Predicate<Integer> action) {
}

