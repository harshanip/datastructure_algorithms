package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.leetcode.easy.HammingDistance;

public class HammingDistanceTest {

    @Test
    public void test() {
       int x=1,y=4;
       assertEquals(2, new HammingDistance().hammingDistance(x, y));
    }

}
