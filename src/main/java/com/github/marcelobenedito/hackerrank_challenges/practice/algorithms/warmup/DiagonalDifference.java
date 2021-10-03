package com.github.marcelobenedito.hackerrank_challenges.practice.algorithms.warmup;

import java.util.List;

/**
 * See: https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int index = 0;
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (List<Integer> row : arr) {
            primaryDiagonalSum += row.get(index);
            secondaryDiagonalSum += row.get(row.size() - index - 1);
            index++;
        }
        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }
}
