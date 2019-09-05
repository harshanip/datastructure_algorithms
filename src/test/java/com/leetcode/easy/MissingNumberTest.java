package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class MissingNumberTest {

	@Test
	public void example1() {
		int[] input= {3,0,1};
		int expected = 2;
		assertEquals(expected, new MissingNumber().missingNumber(input));
	}
	
	

	@Test
	public void example2() {
		int[] input= {9,6,4,2,3,5,7,0,1};
		int expected = 8;
		assertEquals(expected, new MissingNumber().missingNumber(input));
	}

}
