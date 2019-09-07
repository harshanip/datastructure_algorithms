package com.leetcode.easy;
/**
 * <PRE>
 * Given a positive integer, output its complement number.
The complement strategy is to flip the bits of its binary representation.

Note:

    The given integer is guaranteed to fit within the range of a 32-bit signed integer.
    You could assume no leading zero bit in the integer’s binary representation.

Example 1:

Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits),
and its complement is 010. So you need to output 2.

Example 2:

Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits),
 and its complement is 0. So you need to output 0
 
 https://leetcode.com/submissions/detail/163709585/
 * </PRE>
 * @author dia
 *
 */
public class NumberComplement {
    int findComplement(int num) {
        StringBuilder twosComplement=new StringBuilder();
        int result=0,multiplier=1;
        while(num >0){
            twosComplement.append((char)(1-num%2));
            num/=2;
        }
        char[] array=twosComplement.toString().toCharArray();
        for (int i = 0; i < array.length; i++) {
            result+=multiplier*Integer.valueOf(array[i]);
            multiplier*=2;
        } 
        return result;
    }
    
    
}
