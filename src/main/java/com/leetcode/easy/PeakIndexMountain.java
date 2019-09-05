package com.leetcode.easy;
/**
 * <PRE>
 * Let's call an array A a mountain if the following properties hold:

    A.length >= 3
    There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]

Given an array that is definitely a mountain,
 return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

Example 1:

Input: [0,1,0]
Output: 1

Example 2:

Input: [0,2,1,0]
Output: 1

Note:

    3 <= A.length <= 10000
    0 <= A[i] <= 10^6
    A is a mountain, as defined above.

MyAnswer : https://leetcode.com/submissions/detail/160644509/
 * </PRE>
 * @author dia
 *
 */
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
