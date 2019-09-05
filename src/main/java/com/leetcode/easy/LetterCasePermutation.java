package com.leetcode.easy;

import java.util.*;
/**
 * <PRE>
 * Given a string S, we can transform every letter individually to be
 lowercase or uppercase to create another string.  
 Return a list of all possible strings we could create.

Examples:
Input: S = "a1b2"
Output: ["a1b2", "a1B2", "A1b2", "A1B2"]

Input: S = "3z4"
Output: ["3z4", "3Z4"]

Input: S = "12345"
Output: ["12345"]

Note:

    S will be a string with length at most 12.
    S will consist only of letters or digits.
 * </PRE>
 * @author dia
 *
 */
//TODO : Optimize Solution.
public class LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        List<String> result = new LinkedList<>();
        result.add("");
        for (char c: S.toCharArray()) {
            List<String> tmp = new LinkedList<>();
             
            switch (c) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                for (String string : result) {
                    tmp.add(string + c); 
                }
                break;

            default:
                for (String string : result) {
                    tmp.add(string + Character.toUpperCase(c));
                    tmp.add(string + Character.toLowerCase(c));
                }
                break;

            }
            result = tmp;
        }
        return result;
    }
}
