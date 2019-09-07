package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.leetcode.datastructures.TreeNode;
import com.leetcode.easy.MaximumDepthofBinaryTree;

 

public class MaximumDepthofBinaryTreeTest {

    @Test
    public void test() {
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(3);
        tree1.left.left = new TreeNode(5);
        tree1.right = new TreeNode(2);

        int height = new MaximumDepthofBinaryTree().maxDepth(tree1);
        assertEquals(3, height);

    }

    @Test
    public void testNull() {
        int height = new MaximumDepthofBinaryTree().maxDepth(null);
        assertEquals(0, height);

    }

}
