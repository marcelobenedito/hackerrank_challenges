package com.github.marcelobenedito.hackerrank_challenges.practice.algorithms.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SimpleArraySumTest {

    @Test
    @DisplayName("Should return the sum of an integer array")
    void testSimpleArraySum() {
        List<Integer> ar = Arrays.asList(1, 2, 3, 4, 10, 11);
        Assertions.assertEquals(31, SimpleArraySum.simpleArraySum(ar));
    }
}
