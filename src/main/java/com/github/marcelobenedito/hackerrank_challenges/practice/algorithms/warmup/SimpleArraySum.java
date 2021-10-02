package com.github.marcelobenedito.hackerrank_challenges.practice.algorithms.warmup;

import java.util.List;

/**
 * See: https://www.hackerrank.com/challenges/simple-array-sum/problem
 */
public class SimpleArraySum {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */
    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int result = 0;
        for (int value : ar) {
            result += value;
        }
        return result;
    }
}
