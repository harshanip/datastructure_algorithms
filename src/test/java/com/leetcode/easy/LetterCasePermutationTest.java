package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*
;public class LetterCasePermutationTest {

    @Test
    public void test1() {
        String s= "a1b2";
       // Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
       List<String>    list=     new LetterCasePermutation().letterCasePermutation(s);
       assertEquals(4, list.size());
       assertTrue(list.contains("a1b2"));
       assertTrue(list.contains("a1B2"));
       assertTrue(list.contains("A1b2"));
       assertTrue(list.contains("A1B2"));
    }

    @Test
    public void test2() {
        String s= "ab";
       // Output: ["ab", "aB", "Ab", "AB"]
       List<String>    list=     new LetterCasePermutation().letterCasePermutation(s);
       assertEquals(4, list.size());
       assertTrue(list.contains("ab"));
       assertTrue(list.contains("aB"));
       assertTrue(list.contains("Ab"));
       assertTrue(list.contains("AB"));
    }
//           
//            

//    @Test
//    public void test() {
//        fail("Not yet implemented");
//    }
//
//            Input: S = "3z4"
//            Output: ["3z4", "3Z4"]
 
//
//            Input: S = "12345"
//            Output: ["12345"]

    
}
