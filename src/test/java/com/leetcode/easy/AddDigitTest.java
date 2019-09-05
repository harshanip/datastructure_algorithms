package com.leetcode.easy;


import static org.junit.Assert.*;

import org.junit.Test;


public class AddDigitTest {

    @Test
    public void test() {
        int input=38
        ,expected= 2 ;
        assertEquals(expected, new AddDigit().addDigits(input));
    }
    @Test
    public void test0() {
        int input=0
        ,expected= 0 ;
        assertEquals(expected, new AddDigit().addDigits(input));
    }
    @Test
    public void test2() {
        int input=36*9
        ,expected= 9 ;
        assertEquals(expected, new AddDigit().addDigits(input));
    }

}
