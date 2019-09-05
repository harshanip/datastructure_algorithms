package com.leetcode.medium;
/*
 * <PRE>
 * 

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
 1,1 3,1
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P . . I . .N
A   L S  I G
Y A   H R
P     I


 * </PRE>
 */
public class ZigZagConversion {
	 public String convert(String input, int numOfRows) {
     	if (numOfRows == 1)
			return input;
		StringBuilder[] matrix = new StringBuilder[numOfRows];
		StringBuilder output = new StringBuilder();
		int indexOfString = 0;
		final int MAX_ROW_IDX = numOfRows - 1;
		
		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = new StringBuilder();
		}
		
		while (indexOfString < input.length()) {
			for (int j = 0; indexOfString < input.length(); j++) {
				if (j % (MAX_ROW_IDX) == 0) {
					for (int i = 0; i < numOfRows && indexOfString < input.length(); i++) {
						matrix[i].append(input.charAt(indexOfString++));
					}
				} else {
					int positionOfRow = MAX_ROW_IDX - (j % MAX_ROW_IDX);
					if (indexOfString < input.length())
						matrix[positionOfRow].append(input.charAt(indexOfString++));

				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			output.append(matrix[i]);
		}
		return output.toString();
 }
}
