package com.leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntervalIntersectionTest {

	@Test
	public void test() {
		int[][] A = { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } },
				B = { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } },
				Output = { { 1, 2 }, { 5, 5 }, { 8, 10 }, { 15, 23 }, { 24, 24 }, { 25, 25 } };
		assertArrayEquals(Output, IntervalIntersection.intervalIntersection(A, B));
	}
	
	@Test
	public void testNoEqualBoundaries() {
		int[][] A = { { 0, 2 }, { 6, 10 }, { 13, 23 }, { 25, 25 } },
				B = { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } },
				Output = { { 1, 2 },{ 8, 10 }, { 15, 23 },{ 25, 25 } };
		assertArrayEquals(Output, IntervalIntersection.intervalIntersection(A, B));
	}
	@Test
	public void testNoEqualBoundaries2() {
		int[][] A = { { 0, 2 }, { 6, 10 }, { 13, 23 }},
				B = { { 1, 5 }, { 8, 12 }, { 15, 24 }},
				Output = { { 1, 2 },{ 8, 10 }, { 15, 23 } };
		assertArrayEquals(Output, IntervalIntersection.intervalIntersection(A, B));
	}


}
