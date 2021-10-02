package com.github.marcelobenedito.hackerrank_challenges.practice.algorithms.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolveMeFirstTest {

    @Test
    @DisplayName("Should sum 2 + 3 = 5")
    void testSolveMeFirst() {
        Assertions.assertEquals(5, SolveMeFirst.solveMeFirst(2, 3));
    }
}
