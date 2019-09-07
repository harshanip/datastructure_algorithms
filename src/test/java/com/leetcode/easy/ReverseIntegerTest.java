package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseIntegerTest {

	@Test
	public void example1() {

		// Input: 123
		// Output: 321
		int input = 123, expected = 321;
		assertEquals(expected, new ReverseInteger().reverse(input));
	}

	@Test
	public void example2() {
		// Input: -123
		// Output: -321

		int input = -123, expected = -321;
		assertEquals(expected, new ReverseInteger().reverse(input));
	}

	@Test
	public void example3() {
		// Input: 120
		// Output: 21

		int input = 120, expected = 21;
		assertEquals(expected, new ReverseInteger().reverse(input));
	}

	@Test
	public void shouldReturnZeroWhenReverseOverflowInteger() {
		int input = 1534236469; // 9649324351
								// 105689759 is more than what integr can store
								// should return 0
		assertEquals(0, new ReverseInteger().reverse(input));
	}

	@Test
	public void shouldReturnZeroWhenUnderflowInteger() {
		int input = -2147483648;
		assertEquals(0, new ReverseInteger().reverse(input));
	}

	@Test
	public void shouldOmmitfinalZeros() {
		int input = 90000, output = 9;
		assertEquals(output, new ReverseInteger().reverse(input));
	}

}
