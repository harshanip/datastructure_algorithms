package com.leetcode.easy;

import java.util.LinkedList;

import com.leetcode.datastructures.TreeNode;

/**
 * <PRE>
 * Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9

Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
 * </PRE>
 * 
 * @author dia
 *
 */
public class InvertTree {

	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return null;
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}

	public TreeNode _v2__invertTree(TreeNode root) {
		if (root == null)
			return null;
		LinkedList<TreeNode> nodelist = new LinkedList<>();
		TreeNode current = root;
		while (current != null) {
			TreeNode tmp = current.left;
			current.left = current.right;
			current.right = tmp;
			if (current.left != null)
				nodelist.add(current.left);
			if (current.right != null)
				nodelist.add(current.right);
			current = nodelist.poll();
		}
		return root;
	}

	public TreeNode _v1_invertTree(TreeNode root) {
		if (root == null)
			return null;
		LinkedList<TreeNode> nodelist = new LinkedList<>();
		nodelist.add(root);
		while (!nodelist.isEmpty()) {
			TreeNode current = nodelist.remove();
			if (current == null || (current.left == null && current.right == null))
				continue;
			TreeNode tmp = current.left;
			current.left = current.right;
			current.right = tmp;
			nodelist.add(current.left);
			nodelist.add(current.right);
		}
		return root;
	}
}
