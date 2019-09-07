package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.leetcode.easy.RemoveDuplicates;

public class RemoveDuplicatesTest {

	@Test
	public void test() {
		// Given nums = [1,1,2],
		// return length = 2, with the first two elements of nums being 1 and 2
		// respectively.
		int[] nums = { 1, 1, 2 };
		int lenght = 2;
		assertEquals(lenght, new RemoveDuplicates().removeDuplicates(nums));
		assertEquals(1, nums[0]);
		assertEquals(2, nums[1]);
	}

	@Test
	public void example2() {
		// Given nums = [0,0,1,1,1,2,2,3,3,4],
		// Your function should return length = 5, with the first five elements
		// of nums being modified to 0, 1, 2, 3, and 4 respectively.
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int lenght = 5;
		assertEquals(lenght, new RemoveDuplicates().removeDuplicates(nums));
		for (int i = 0; i <= 4; i++) {
			assertEquals(i, nums[i]);
		}

	}

}
