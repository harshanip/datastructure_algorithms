package com.leetcode.easy;

public class PeakIndexMountain {
    public int peakIndexInMountainArray(int[] A) {
        // 3 <= A.length <= 10000
        int peak = 0;
        while (peak < A.length - 1) {
            if (A[peak] < A[peak + 1])
                peak++;
            else
                return peak;
        }
        throw new IllegalArgumentException("Array is not a mountain");
    }
}
