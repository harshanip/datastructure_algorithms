package com.leetcode.easy;

/**
 * <PRE>
 * 
 * Given a non-negative integer num, repeatedly add all its digits until 
 * the result has only one digit.

 * Example:

 * Input: 38
 * Output: 2 
 * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
             Since 2 has only one digit, return it.

 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 * </PRE>
 * @author dia
 *
 */
public class AddDigit {
    public int addDigits(int num) { 
        return  (num % 9 == 0)?(num==0)?0:9:num % 9;
    }
}