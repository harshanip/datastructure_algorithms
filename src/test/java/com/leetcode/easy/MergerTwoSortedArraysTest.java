package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergerTwoSortedArraysTest {
	MergerTwoSortedArrays program = new MergerTwoSortedArrays();

	@Test
	public void test() {
		/**
		 * <PRE>
		 * Example: 
		 * Input: nums1 = [1,2,3,0,0,0], m = 3 nums2 = [2,5,6], n = 3
		 * Output: [1,2,2,3,5,6]
		 * </PRE>
		 */
		int[] nums1 = { 1, 2, 3, 0, 0, 0,0 }, nums2 = {1, 2, 5, 6 };
		int m = 3, n = 4;
		program.merge(nums1, m, nums2, n);
		assertArrayEquals(new int[] {1, 1, 2, 2, 3, 5, 6 }, nums1);
	}
	
	/**
	 * [0]
0
[1]
1
	 */
	@Test
	public void testWithOneEmpty() {
		/**
		 * <PRE>
		 * Example: 
		 * Input: nums1 = [0], m = 0 nums2 = [1], n = 1
		 * Output: [1]
		 * </PRE>
		 */
		int[] nums1 = {0 }, nums2 = {1};
		int m = 0, n = 1;
		program.merge(nums1, m, nums2, n);
		assertArrayEquals(new int[] {1 }, nums1);
	}

}
