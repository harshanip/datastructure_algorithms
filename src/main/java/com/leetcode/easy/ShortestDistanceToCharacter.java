package com.leetcode.easy;
/**
 * <PRE>
 * Given a string S and a character C, return an array of integers 
representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]

 

Note:

    S string length is in [1, 10000].
    C is a single character, and guaranteed to be in string S.
    All letters in S and C are lowercase.
    
MyAnswer https://leetcode.com/submissions/detail/160813468/ : no runtime analysis
Solution 


 * </PRE>
 * @author dia
 *
 */
public class ShortestDistanceToCharacter {
    public int[] shortestToChar(String S, char C) {
        int length=S.length();
        int[] shortestLenght = new int[length];
        int indexofC = -10000000 ;
        for (int index=0;index < length;index++) {
            char cur = S.charAt(index);
            if (cur == C) {
                indexofC = index;
                for (int i = index-1; i >=0  ; i--) {
                    shortestLenght[index]=0;
                    int distance =  indexofC-i;
                    if(shortestLenght[i] <= distance) break;
                    else shortestLenght[i] = distance;
                }
            } else {
                shortestLenght[index] = (index - indexofC) ;
            }
        }
        return shortestLenght;
    }
}
