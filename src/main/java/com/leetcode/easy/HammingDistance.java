package com.leetcode.easy;
/**
 * <PRE>
 * MyAnswer : https://leetcode.com/submissions/detail/160743400/ 12ms 60%
https://leetcode.com/submissions/detail/160747919/ 12ms
The Hamming distance between two integers is the number of positions at which 
the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.

 * </PRE>
 * @author dia
 *
 */
public class HammingDistance {
    

    public int hammingDistance(int x, int y) {
        int dif = x ^ y;
        int result = 0;
        while (dif != 0) {
            result += dif % 2;
            dif /= 2;
        }
        return result;
    }
}
