package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;


public class ArrayPartition1Test {

    @Test
    public void test() {
        int[] input = { 1, 4, 3, 2 };
        int expected = 4;
        assertEquals(expected, new ArrayPartition1().arrayPairSum(input));
    }

}
