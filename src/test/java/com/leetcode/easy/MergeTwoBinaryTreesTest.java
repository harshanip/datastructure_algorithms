package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.leetcode.datastructures.TreeNode;

public class MergeTwoBinaryTreesTest {

	@Test
	public void test() {
		/**
		 * <PRE>
		 * 
		Input: 
		Tree 1:       Tree 2:              Output:   Merged tree:
		  1                    2              	     3               
		 / \                  / \             	    / \               
		3   2                1   3           	   4   5             
		/                      \   \ 	      	  / \   \                     
		5                       4   7          	 5   4   7
		 * </PRE>
		 */

		TreeNode tree1 = new TreeNode(1);
		tree1.left = new TreeNode(3);
		tree1.left.left = new TreeNode(5);
		tree1.right = new TreeNode(2);

		TreeNode tree2 = new TreeNode(2);
		tree2.left = new TreeNode(1);
		tree2.left.right = new TreeNode(4);
		tree2.right = new TreeNode(3);
		tree2.right.right = new TreeNode(7);
		TreeNode mergedTree = new MergeTwoBinaryTrees().mergeTrees(tree1, tree2);
		assertNotNull(mergedTree);
		assertEquals(3, mergedTree.val);
		assertEquals(4, mergedTree.left.val);
		assertEquals(5, mergedTree.right.val);
		assertEquals(5, mergedTree.left.left.val);
		assertEquals(4, mergedTree.left.right.val);
		assertEquals(7, mergedTree.right.right.val);

	}
}
