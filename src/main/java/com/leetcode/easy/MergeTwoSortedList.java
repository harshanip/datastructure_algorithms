//21. Merge Two Sorted Lists
package com.leetcode.easy;

import com.leetcode.datastructures.ListNode;

/**
 * <PRE>
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 * Example:Input: 1->2->4, 1->3->4 , Output: 1->1->2->3->4->4
 * </PRE>
 * 
 * @author dia
 *
 */
public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		else if (l1 == null)
			return l2;
		else if (l2 == null)
			return l1;
		ListNode head, minNode, tmpNode;
		head = (l1.val < l2.val) ? l1 : l2;
		minNode = head;
		tmpNode = (l1.val >= l2.val) ? l1 : l2;
		while (tmpNode != null) {
			while (minNode.next != null && minNode.next.val < tmpNode.val) {
				minNode = minNode.next;
			}
			ListNode tmp = minNode.next;
			minNode.next = tmpNode;
			minNode = minNode.next;
			tmpNode = tmp;
		}
		return head;
	}

}
