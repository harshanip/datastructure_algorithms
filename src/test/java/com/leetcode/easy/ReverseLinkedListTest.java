package com.leetcode.easy;

import static org.mockito.Mockito.*;

import org.junit.Test;

import static org.junit.Assert.*;

import com.leetcode.datastructures.ListNode;

public class ReverseLinkedListTest {

	@Test
	public void testOndeNodeList() {
		 ListNode head=mock(ListNode.class);
		ListNode result = new ReverseLinkedList().reverseList(head);
		assertEquals(head, result);
	}
	
	@Test
	public void testList() {
		//Input: 1->2->3->4->5->NULL
		//Output: 5->4->3->2->1->NULL
		 ListNode node1= new ListNode(1);
		 ListNode node2= new ListNode(2);
		 ListNode node3= new ListNode(3);
		 ListNode node4= new ListNode(4);
		 ListNode node5= new ListNode(5);
		 node1.next=node2;
		 node2.next=node3;
		 node3.next=node4;
		 node4.next=node5;	
		ListNode result = new ReverseLinkedList().reverseList(node1);
		assertEquals(node5, result);
		assertEquals(node4, node5.next);
		assertEquals(node3, node4.next);
		assertEquals(node2, node3.next);
		assertEquals(node1, node2.next);
		assertNull(node1.next);
	}

}
