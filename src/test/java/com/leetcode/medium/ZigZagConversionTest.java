package com.leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

 

public class ZigZagConversionTest {
	@Test
	public void testOneRows() {

		//Input: s = "PAYPALISHIRING", numRows = 1
		//Output: "PAYPALISHIRING"
		String input = "PAYPALISHIRING";
		String expectedOutput = "PAYPALISHIRING";
		int numOfRows = 1;
		String output = new ZigZagConversion().convert(input, numOfRows); 
		assertEquals(expectedOutput, output);	 	 
	}
	
	@Test
	public void testThreeRows() {

		//Input: s = "PAYPALISHIRING", numRows = 3
		//Output: "PAHNAPLSIIGYIR"
		String input = "PAYPALISHIRING";
		String expectedOutput = "PAHNAPLSIIGYIR";
		int numOfRows = 3;
		String output = new ZigZagConversion().convert(input, numOfRows); 
		assertEquals(expectedOutput, output);	 	 
	}

	@Test
	public void testFourRows() {

		//Input: s = "PAYPALISHIRING", numRows = 4
		//Output: "PINALSIGYAHRPI"
		String input = "PAYPALISHIRING";
		int numOfRows = 4;
		String output = new ZigZagConversion().convert(input, numOfRows);
		assertEquals("PINALSIGYAHRPI", output); 
	}

 

}
