package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.leetcode.easy.NumberComplement;

public class NumberComplementTest {

    @Test
    public void test5() { 
        int input=5,expected=2;
        int actual=new NumberComplement().findComplement(input);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test1() { 
        int input=1,expected=0;
        int actual=new NumberComplement().findComplement(input);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test2() { 
        //10 ->01
        int input=2,expected=1;
        int actual=new NumberComplement().findComplement(input);
        assertEquals(expected, actual);
    }

    
    @Test
    public void test3() { 
        //10 ->01
        int input=3,expected=0;
        int actual=new NumberComplement().findComplement(input);
        assertEquals(expected, actual);
    }

}
