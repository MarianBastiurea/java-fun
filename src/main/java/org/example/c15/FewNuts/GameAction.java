package org.example.c15.FewNuts;

import java.util.function.Predicate;

public record GameAction(char key, String prompt, Predicate<Integer> action) {
}

