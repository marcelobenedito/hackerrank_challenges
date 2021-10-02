package com.github.marcelobenedito.hackerrank_challenges.practice.algorithms.warmup;

import java.util.List;

/**
 * See: https://www.hackerrank.com/challenges/a-very-big-sum/problem?h_r=next-challenge&h_v=zen
 */
public class VeryBigSum {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */
    public static long aVeryBigSum(List<Long> ar) {
        long result = 0L;
        for (long value : ar) {
            result += value;
        }
        return result;
    }
}
