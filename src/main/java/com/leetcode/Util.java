package com.leetcode;

public class Util {
    public static void printMatrix(int[][] coinValues) {
        for (int i = 0; i < coinValues.length; i++) {
            for (int j = 0; j < coinValues.length; j++) {
                System.out.printf("%5d", coinValues[i][j]);
            }
            System.out.println();
        }
    }

}
