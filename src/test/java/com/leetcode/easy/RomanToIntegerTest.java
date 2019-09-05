package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanToIntegerTest {
	RomanToInteger romanToInteger;

	@Before
	public void setUp() {
		romanToInteger = new RomanToInteger();
	}

	@Test
	public void example1() {
		String input = "III";
		int expected = 3; 
		int actual = romanToInteger.romanToInt(input); 
		assertEquals(expected, actual);

	}
 
	@Test
	public void example2() {
		// Example 2: 		// Input: "IV"		// Output: 4
		String input = "IV";
		int expected = 4; 
		int actual = romanToInteger.romanToInt(input); 
		assertEquals(expected, actual);
	}
 
	@Test
	public void example3() {
		// Example 3:	// Input: "IX"	// Output: 9
		String input = "IX";
		int expected = 9; 
		int actual = romanToInteger.romanToInt(input); 
		assertEquals(expected, actual);
	}

	@Test
	public void example4() {
		// Example 4:	// Input: "LVIII" 	// Output: 58
		// Explanation: C = 100, L = 50, XXX = 30 and III = 3.
		// Example 3:	// Input: "IX"	// Output: 9
		String input = "LVIII";
		int expected = 58; 
		int actual = romanToInteger.romanToInt(input); 
		assertEquals(expected, actual);
	}
	
	@Test
	public void example5() {
		// Example 5:	// Input: "MCMXCIV"	// Output: 1994
		// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
		String input = "MCMXCIV";
		int expected = 1994; 
		int actual = romanToInteger.romanToInt(input); 
		assertEquals(expected, actual);
	}
	
	@Test
	public void failed1() {
//		Input: "CXC" //		Output: 210//		Expected: 190 C->100 XC->90
		String input = "CXC";
		int expected = 190; 
		int actual = romanToInteger.romanToInt(input); 
		assertEquals(expected, actual);
	}

}
