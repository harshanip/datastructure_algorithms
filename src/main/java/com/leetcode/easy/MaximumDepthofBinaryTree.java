package com.leetcode.easy;
/**
 * <PRE>
 * Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

return its depth = 3.

https://leetcode.com/submissions/detail/163806035/ 10%
https://leetcode.com/submissions/detail/163809118/ 100% , recursive version is more efficient 
 * </PRE>
 */
import java.util.LinkedList;
import java.util.Queue;

import com.leetcode.datastructures.TreeNode;


public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        return maxDepthRecursive(root);
    }

    public int maxDepthRecursive(TreeNode root) {
        return findDepth(root, 0);
    }

    public int findDepth(TreeNode node, int depth) {
        if (node == null)
            return depth;
        else {
            int left = findDepth(node.left, depth + 1);
            int right = findDepth(node.right, depth + 1);
            return right > left ? right : left;
        }
    }

    public int maxDepthIterative(TreeNode root) {
        if (root == null)
            return 0;
        int maxHeight = 1;
        Queue<TreeNode> nodeList = new LinkedList<>();
        Queue<Integer> depth = new LinkedList<>();
        nodeList.offer(root);
        depth.offer(1);
        while (!nodeList.isEmpty()) {
            TreeNode node = nodeList.poll();
            Integer height = depth.poll();
            if (height > maxHeight)
                maxHeight = height;
            if (node.left != null) {
                nodeList.offer(node.left);
                depth.offer(height + 1);

            }
            if (node.right != null) {
                nodeList.offer(node.right);
                depth.offer(height + 1);

            }
        }
        return maxHeight;
    }
}
