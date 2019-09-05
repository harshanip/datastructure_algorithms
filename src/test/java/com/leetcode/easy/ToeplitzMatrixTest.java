package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToeplitzMatrixTest {

    @Test
    public void test1() {
        // Output: True
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 1, 2, 3 },
                { 9, 5, 1, 2 }
        };
        assertTrue(new ToeplitzMatrix().isToeplitzMatrix(matrix));
    }

    @Test
    public void test2() {
        int[][] matrix = {
                { 1, 2 },
                { 2, 2 }
        };
        assertFalse(new ToeplitzMatrix().isToeplitzMatrix(matrix));
    }

    @Test
    public void test3() {
        int[][] matrix = {
                { 83 },
                { 64 }, 
                { 57 }
        };
        assertTrue(new ToeplitzMatrix().isToeplitzMatrix(matrix));
    }

    @Test
    public void test4() {
        int[][] matrix = {
                { 41, 45 }, 
                { 81, 41 }, 
                { 73, 81 }, 
                { 47, 73 }, 
                { 76, 47 }, 
                { 79, 76 }
        };
        assertTrue(new ToeplitzMatrix().isToeplitzMatrix(matrix));
    }
}
