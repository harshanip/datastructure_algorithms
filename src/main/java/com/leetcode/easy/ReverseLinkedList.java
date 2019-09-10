//206. Reverse Linked List
package com.leetcode.easy;

import com.leetcode.datastructures.ListNode;

/**
 * <PRE>
 * Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
 * </PRE>
 * @author dia
 *
 */
public class ReverseLinkedList {
	  public ListNode reverseList(ListNode head) {
	        ListNode previous=null;
	        ListNode current=head;
	        while(current  !=null){
	        	ListNode tmp= current.next;
	        	current.next = previous;
	        	previous= current;
	        	current =tmp;
	        }
	        return previous;
	  }

}
