package com.leetcode.easy;

import static org.mockito.Mockito.*;

import org.junit.Test;

import static org.junit.Assert.*;

import com.leetcode.datastructures.ListNode;

public class MergeTwoSortedListTest {

	@Test
	public void testOndeNodeList() {
		 ListNode node1= new ListNode(1);
		 ListNode node2= new ListNode(2);
		ListNode result = new MergeTwoSortedList().mergeTwoLists(node1, node2);
		assertEquals(1, result.val);
		assertEquals(2, result.next.val);
	}
	
	@Test
	public void testList() {
		//Example:Input: 1->2->4, 1->3->4 , Output: 1->1->2->3->4->4
		 ListNode node1= new ListNode(1);
		 ListNode node2= new ListNode(2);
		 ListNode node3= new ListNode(4);
		 node1.next=node2;
		 node2.next=node3;
		 
		 ListNode node4= new ListNode(1);
		 ListNode node5= new ListNode(3);
		 ListNode node6= new ListNode(4);
		 node4.next=node5;	
		 node5.next=node6;
		ListNode result = new MergeTwoSortedList().mergeTwoLists(node1, node4);
		assertEquals(1, result.val);		 
		assertEquals(1, result.next.val);
		assertEquals(2, result.next.next.val);
		assertEquals(3, result.next.next.next.val);
		assertEquals(4, result.next.next.next.next.val);
		assertEquals(4, result.next.next.next.next.next.val);
	}


}
