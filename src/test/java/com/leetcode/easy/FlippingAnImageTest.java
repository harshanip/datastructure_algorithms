package com.leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FlippingAnImageTest {

    @Test
    public void test1() {
        int[][] input = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } },
                expected = { { 1, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
        // Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
        // Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
        int[][] actual = new FlippingAnImage().flipAndInvertImage(input);
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals("Invalid input:" + i + "," + j, expected[i][j], actual[i][j]);
            }
        }
    }

    @Test
    public void test2() {
        int[][] input = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } },
                expected = { { 1, 1, 0, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 1 }, { 1, 0, 1, 0 } };
        // Explanation: First reverse each row: [[1,0,1,1],[1,1,0,1],[1,0,0,0]].
        // Then, invert the image: [[0,1,0,0],[0,0,1,0],[0,1,1,1]]
        int[][] actual = new FlippingAnImage().flipAndInvertImage(input);
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals("Invalid input:" + i + "," + j, expected[i][j], actual[i][j]);
            }
        }
    }

    @Test
    public void test3() {
        int[][] input = { { 1, 1, 0, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 1 } },
                expected = { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 1, 1, 1 } };
        // Explanation: First reverse each row: [[1,0,1,1],[1,1,0,1],[1,0,0,0]].
        // Then, invert the image: [[0,1,0,0],[0,0,1,0],[0,1,1,1]]
        int[][] actual = new FlippingAnImage().flipAndInvertImage(input);
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals("Invalid input:" + i + "," + j, expected[i][j], actual[i][j]);
            }
        }
    }

}
