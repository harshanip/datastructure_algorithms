package com.leetcode.easy;

import com.leetcode.datastructures.TreeNode;


/**
 * <PRE>
 *  Given two binary trees and imagine that when you put one of them to cover the other,
  some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes 
overlap, then sum node values up as the new value of the merged node. Otherwise, 
the NOT null node will be used as the node of new tree.

Example 1:

Input: 
	Tree 1:                     Tree 2:                
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7   
      [1,3,2,5]
[2,1,3,null,4,null,7]               
Output: 
Merged tree:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7

Note: The merging process must start from the root nodes of both trees.

MyAnswer : https://leetcode.com/submissions/detail/160478871/

 * </PRE>
 */

class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode n;
        if (t1 == null && t2 == null)
            return null;
        else if (t1 == null) {
        	return t2;
        } else if (t2 == null) {
            n = new TreeNode(t1.val);
            n.left = t1.left;
            n.right = t1.right;
            // XXX performance would be better if we just return t1
        } else {
            n = new TreeNode(t2.val + t1.val);
            n.left = mergeTrees(t1.left, t2.left);
            n.right = mergeTrees(t1.right, t2.right);
        }

        return n;
    }
}
