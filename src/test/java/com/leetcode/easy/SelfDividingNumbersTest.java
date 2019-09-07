package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.leetcode.easy.SelfDividingNumbers;

import java.util.*;

public class SelfDividingNumbersTest {

    @Test
    public void test() {
        int left = 1, right = 22;
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
        List<Integer> actual = new SelfDividingNumbers().selfDividingNumbers(left, right);
        assertEquals(0, new ListComparator().compare(expected, actual) );

    }

    class ListComparator implements java.util.Comparator<List<Integer>> {

        @Override
        public int compare(List<Integer> o1, List<Integer> o2) {
            int size =o1.size() - o2.size();
            if(size ==0 && o1.containsAll(o2)) 
                return 0;
             else 
                return size;
            
            
        }

    }

}
