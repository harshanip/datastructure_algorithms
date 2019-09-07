package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.leetcode.datastructures.TreeNode;
import com.leetcode.easy.InvertTree;


public class InvertTreeTest {

    @Test
    public void test() {
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.left.left = new TreeNode(3);
        tree1.left.right = new TreeNode(4);
        tree1.right = new TreeNode(5);
        tree1.right.left = new TreeNode(6);
        tree1.right.right = new TreeNode(7);
        

        System.out.println(tree1 );
        assertNotNull(new InvertTree().invertTree(tree1));
        System.out.println(tree1 );
 
    }

}
