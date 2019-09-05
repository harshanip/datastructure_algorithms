package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.leetcode.easy.JudgeRouteCircle;

public class JudgeRouteCircleTest {

    @Test
    public void test() {
        String moves="UD";
         assertTrue(new JudgeRouteCircle().judgeCircle(moves));
    }
    
    @Test
    public void test2() {
        String moves="LL";
         assertFalse(new JudgeRouteCircle().judgeCircle(moves));
    }

}
