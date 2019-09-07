package com.leetcode.easy;
/**
 * <PRE>
 * Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321

Example 2:

Input: -123
Output: -321

Example 3:

Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only store integers within 
the 32-bit signed integer range: [−231,  231 − 1]. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

https://leetcode.com/articles/reverse-integer/#


 *</PRE>
 * @author dia
 *
 */
public class ReverseInteger {

	public int reverse(int x) {
		int output = 0;
		while (x != 0) {
			int digit = x % 10;
			if (output > Integer.MAX_VALUE / 10 || (output == Integer.MIN_VALUE && digit > 7))
				return 0;
			if (output < Integer.MIN_VALUE / 10 || (output == Integer.MIN_VALUE && digit < -8))
				return 0;
			output = output * 10 + x % 10;
			x /= 10;
		}

		return output;
	}

	public int reverseold(int x) {
		int negativeFactor = (x < 0) ? -1 : 1;
		String s = String.valueOf(x * negativeFactor);
		String output = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			output += s.charAt(i);
		}
		try {
			return Integer.parseInt(output) * negativeFactor;
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}
