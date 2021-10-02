package com.github.marcelobenedito.hackerrank_challenges.practice.algorithms.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class VeryBigSumTest {

    @Test
    @DisplayName("Should sum big integers")
    void testAVeryBigSum() {
        List<Long> ar = Arrays.asList(
                1000000001L, 1000000002L,
                1000000003L, 1000000004L,
                1000000005L);
        Assertions.assertEquals(5000000015L, VeryBigSum.aVeryBigSum(ar));
    }
}
