package com.leetcode.easy;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.leetcode.easy.ShortestDistanceToCharacter;

public class ShortestDistanceToCharacterTest {


    @Test
    public void test1() {

        String S = "love";
        char C = 'e';
        int[] expected = { 3, 2, 1, 0};
        int[] actual=new ShortestDistanceToCharacter().shortestToChar(S, C);
        common.Printer.print(expected);
        common.Printer.print(actual);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test2() {

        String S = "loveleetcode";
        char C = 'e';
        int[] expected = { 3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0 };
        int[] actual=new ShortestDistanceToCharacter().shortestToChar(S, C);
 
        assertTrue(Arrays.equals(expected, actual));
    }

}
