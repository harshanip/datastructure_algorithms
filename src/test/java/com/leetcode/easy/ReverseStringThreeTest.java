package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringThreeTest {

    @Test
    public void test() {
        String input = "Let's take LeetCode contest",
                expected = "s'teL ekat edoCteeL tsetnoc";
        String actual = new ReverseStringThree().reverseWords(input);
        assertEquals(expected, actual);
    }


    @Test
    public void test2() {
        String input = "take",
                expected = "ekat";
        String actual = new ReverseStringThree().reverseWords(input);
        assertEquals(expected, actual);
    }
    

    @Test
    public void test3() {
        String input = "take make",
                expected = "ekat ekam";
        String actual = new ReverseStringThree().reverseWords(input);
        assertEquals(expected, actual);
    }

}
