package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class JewelsAndStonesTest {

    @Test
    public void test1() {

        String J = "aA", S = "aAAbbbb";
        int expected = 3;
        assertEquals(expected, new JewelsAndStones().numJewelsInStones(J, S));
    }

    @Test
    public void test2() {

        String J = "z", S = "ZZ";
        int expected = 0;
        assertEquals(expected, new JewelsAndStones().numJewelsInStones(J, S));
    }

}
