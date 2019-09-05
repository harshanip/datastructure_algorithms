package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeakIndexMountainTest {

    @Test
    public void test1() {
        int[] input = { 0, 1, 0 };
        assertEquals(1, new PeakIndexMountain().peakIndexInMountainArray(input));

    }

    @Test
    public void test2() {

        int[] input = { 0, 2, 1, 0 };
        assertEquals(1, new PeakIndexMountain().peakIndexInMountainArray(input));

    }

 
    public void test3() {
//It says all inputs are mountains. so no need to check for non mountains
        int[] input = { 0, 2, 3 };
        assertEquals(0, new PeakIndexMountain().peakIndexInMountainArray(input));

    }
}
