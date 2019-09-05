package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransposeMatrixTest {

    @Test
    public void test1() {
        int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] expected = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
        int[][] actual = new TransposeMatrix().transpose(input);
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[i].length; j++) {
                assertEquals("Falied for: " +i+","+j,expected[i][j], actual[i][j]);
            }
        }
    }


    @Test
    public void test2() {
        int[][] input =  {{1,2,3},{4,5,6}}; 
        int[][] expected =  {{1,4},{2,5},{3,6}};
        int[][] actual = new TransposeMatrix().transpose(input);
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[i].length; j++) {
                assertEquals("Falied for: " +i+","+j,expected[i][j], actual[i][j]);
            }
        }
    }

}
