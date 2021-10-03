package com.github.marcelobenedito.hackerrank_challenges.practice.algorithms.warmup;

import java.util.Arrays;
import java.util.List;

/**
 * See: https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */
public class CompareTriplets {
    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;
        for (int i = 0; i < a.size(); i++) {
            int alicePoints = a.get(i);
            int bobPoints = b.get(i);
            // Neighter person earn points.
            if (alicePoints == bobPoints) continue;
            // Alice earned points for the current category.
            if (alicePoints > bobPoints) {
                aliceScore++;
                continue;
            }
            // Bob earned points for the current category.
            bobScore++;
        }
        return Arrays.asList(aliceScore, bobScore);
    }
}
