package com.leetcode.medium;

import com.leetcode.datastructures.ListNode;

/**
 * <PRE>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
TODO test cases

 * </PRE>
 * @author dia
 *
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
 	 ListNode dummyHead = new ListNode(0);
		ListNode tmp = dummyHead;
		int val = 0;
		while (l1 != null || l2 != null) {
			val += ((l1==null)?0:l1.val) + ((l2==null)?0:l2.val);

			tmp.next= new ListNode(val % 10);
			tmp = tmp.next;
			val = val / 10;
			l1 =  (l1==null)?null: l1.next;
			l2 =  (l2==null)?null: l2.next;
		}
		if (val > 0) {
			tmp.next = new ListNode(val % 10);
			tmp = tmp.next; 
		} 
		 
		return dummyHead.next;
	}
}
 