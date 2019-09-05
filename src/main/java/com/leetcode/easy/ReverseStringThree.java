package com.leetcode.easy;
/**
 * <PRE>
 * Given a string, you need to reverse the order of characters in each word 
within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not be any extra space in the string. 
https://leetcode.com/submissions/detail/163712122/
 * </PRE>
 * @author dia
 *
 */
public class ReverseStringThree {
    public String reverseWords(String s) {
        final int LENGTH = s.length();
        char[] output = s.toCharArray();
        int begining=0;
        for (int i =  0; i <LENGTH; i++) {
            if(output[i]==' '){
                for (int j = i - 1, k = begining; j > k; j--, k++) {
                    char tmp = output[j];
                    output[j] = output[k];
                    output[k] = tmp;
                }
                begining=i+1;
            }
        }
        if(begining < LENGTH){
            for (int j = LENGTH - 1, k = begining; j > k; j--, k++) {
                char tmp = output[j];
                output[j] = output[k];
                output[k] = tmp;
            }
        }
        return new String(output);
    }
}
