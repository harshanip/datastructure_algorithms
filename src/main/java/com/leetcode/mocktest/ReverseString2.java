package com.leetcode.mocktest;

import org.junit.Test;
import static  org.junit.Assert.*;
public class ReverseString2 {
    public String reverseStr(String s, int k) {
        String result="";
        boolean reverse=true;
        for(int i=0;i<s.length();i=i+k){
            result+=reverse(s,i,i+k-1,reverse);
            reverse= !reverse;
        }
        return result;
    }

    String reverse(String s, int start, int end,boolean isReverse) {
        if (s.length() <=end)
            end=s.length()-1;
        if(!isReverse){
            return s.substring(start,end+1);
        }else {
            String r="";
            for(int i=end;i>=start;i--){
                r+=s.charAt(i);
            }
            return r;
        }
    }
@Test
    public  void testMethod() {
        String s = "abcdefg";
       String actual = new ReverseString2().reverseStr(s,2);
       assertEquals("bacdfeg",actual);
     actual = new ReverseString2().reverseStr(s,8);
    assertEquals("gfedcba",actual);
    }
}
