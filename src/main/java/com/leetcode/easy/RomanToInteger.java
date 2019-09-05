package com.leetcode.easy;
/**
 * <PRE>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

Example 1:

Input: "III"
Output: 3

Example 2:

Input: "IV"
Output: 4

Example 3:

Input: "IX"
Output: 9

Example 4:

Input: "LVIII"
Output: 58
Explanation: C = 100, L = 50, XXX = 30 and III = 3.

Example 5:

Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


 * </PRE>
 * @author dia
 *
 */
public class RomanToInteger {
 

	public int romanToInt(String theString) {
		int output = 0, index = 0;
		char[] input = theString.toCharArray();
		final int stringLength = input.length;
		while (index < stringLength) {
			char c = input[index++];
			switch (c) {
			case 'I':// I 1
				// I can be placed before V (5) and X (10) to make 4 and 9.
				if (index >= stringLength) {
					output += 1;
				} else {
					char next = input[index];
					if (next == 'V') {
						index++;
						output += 4;
					} else if (next == 'X') {
						index++;
						output += 9;
					} else {
						output += 1;
					}
				}
				break;
			case 'V':// V 5
				output += 5;
				break;
			case 'X':
				// X 10
				// X can be placed before L (50) and C (100) to make 40 and 90.
				if (index >= stringLength) {
					output += 10;
				} else {
					char next = input[index];
					if (next == 'L') {
						index++;
						output += 40;
					} else if (next == 'C') {
						index++;
						output += 90;
					} else {
						output += 10;
					}
				}
				break;
			case 'L':// L 50
				output += 50;
				break;
			case 'C': // C 100
				// C can be placed before D (500) and M (1000) to make 400 and
				// 900.
				if (index >= stringLength) {
					output += 100;
				} else {
					char next = input[index];
					;
					if (next == 'D') {
						index++;
						output += 400;
					} else if (next == 'M') {
						index++;
						output += 900;
					} else {
						output += 100;
					}
				}
				break;
			case 'D':// D 500
				output += 500;
				break;
			case 'M':// M 1000
				output += 1000;
				break;
			default:
				throw new IllegalArgumentException("Invaid Character : " + c);

			}

		}

		return output;
	}

}
