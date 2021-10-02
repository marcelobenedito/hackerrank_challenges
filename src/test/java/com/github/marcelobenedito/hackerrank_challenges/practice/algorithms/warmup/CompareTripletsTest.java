package com.github.marcelobenedito.hackerrank_challenges.practice.algorithms.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CompareTripletsTest {

    @Test
    @DisplayName("Should compare a and b, and return [2, 1]")
    void testCompareTriplets() {
        List<Integer> a = Arrays.asList(17, 28, 30);
        List<Integer> b = Arrays.asList(99, 16, 8);
        List<Integer> expected = Arrays.asList(2, 1);
        Assertions.assertEquals(expected, CompareTriplets.compareTriplets(a, b));
    }
}
