package com.leetcode.medium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.leetcode.datastructures.ListNode;

public class RotateListTest {

	@Test
	public void rotateOnce() {
		// Input: 1->2->3->4->5->NULL
		// Output: 5->1->2->3->4->NULL
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		RotateList rotateList = new RotateList();
		int k = 1;
		ListNode result = rotateList.rotateRight(node1, k);
		assertEquals(node5, result);
		assertNull(node4.next);
		assertEquals(node1, node5.next);
		assertEquals(node2, node1.next);
		assertEquals(node3, node2.next);
		assertEquals(node4, node3.next);

	}

	@Test
	public void rotateThrice() {
		// Input: 1->2->3->4->5->NULL
		// Output: 3->4->5->1->2->NULL

		RotateList rotateList = new RotateList();
		int k = 3;
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		ListNode result = rotateList.rotateRight(node1, k);
		assertEquals(node3, result); 
		assertEquals(node4, node3.next);
		assertEquals(node5, node4.next);
		assertEquals(node1, node5.next);
		assertNull(node2.next);

	}
}
