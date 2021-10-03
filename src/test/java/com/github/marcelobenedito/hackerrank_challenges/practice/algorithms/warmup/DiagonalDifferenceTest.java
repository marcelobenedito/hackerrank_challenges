package com.github.marcelobenedito.hackerrank_challenges.practice.algorithms.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DiagonalDifferenceTest {

    @Test
    @DisplayName("Should sum diagonals and return absolute difference value")
    void testDiagonalDifference() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(11, 2, 4));
        input.add(Arrays.asList(4, 5, 6));
        input.add(Arrays.asList(10, 8, -12));
        Assertions.assertEquals(15, DiagonalDifference.diagonalDifference(input));
    }
}
