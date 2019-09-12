//876. Middle of the Linked List
package com.leetcode.easy;

import com.leetcode.datastructures.ListNode;

/**
 * <PRE>
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.

If there are two middle nodes, return the second middle node.
 * 
 * </PRE>
 * 
 * @author dia
 *
 */
public class MiddleOfSinglyLinkedList {
	public ListNode middleNode(ListNode head) {
		ListNode middle = head;
		ListNode end = head;
		while (end != null && end.next != null) {
			end = end.next.next;
			middle = middle.next;
		}
		return middle;
	}
}
