package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.leetcode.datastructures.ListNode;

public class MiddleOfSinglyLinkedListTest {
	MiddleOfSinglyLinkedList middleOfList=new MiddleOfSinglyLinkedList();
	@Test
	public void testWithOneNode() {
		 ListNode node1= new ListNode(1);
		 assertEquals(node1, middleOfList.middleNode(node1));
	}

	@Test
	public void testWithTwoNode() {
		 ListNode node1= new ListNode(1);
		 ListNode node2= new ListNode(2);
		 node1.next = node2;
		 assertEquals(node2, middleOfList.middleNode(node1));
	}


	@Test
	public void testWithThreeNode() {
		 ListNode node1= new ListNode(1);
		 ListNode node2= new ListNode(2);
		 ListNode node3= new ListNode(3);
		 node1.next = node2;
		 node2.next=node3;
		 assertEquals(node2, middleOfList.middleNode(node1));
	}
	
	@Test
	public void testWithFourNodes() {
			 ListNode node1= new ListNode(1);
			 ListNode node2= new ListNode(2);
			 ListNode node3= new ListNode(3);
			 ListNode node4= new ListNode(4); 
			 node1.next=node2;
			 node2.next=node3;
			 node3.next=node4; 
			ListNode result = middleOfList.middleNode(node1);
			assertEquals(node3, result);  
			assertEquals(node4, node3.next); 
			assertNull(node4.next);
		
	}
	@Test
	public void testWithFiveNodes() {
		/**Example 1:

			Input: [1,2,3,4,5]
			Output: Node 3 from this list (Serialization: [3,4,5])
			*/
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
			ListNode result = middleOfList.middleNode(node1);
			assertEquals(node3, result); 
			assertEquals(node5, node4.next);
			assertEquals(node4, node3.next); 
			assertNull(node5.next);
		
	}

	@Test
	public void testWithSixNodes() {
 
			//Input: 1->2->3->4->5->NULL
			//Output: 5->4->3->2->1->NULL
			 ListNode node1= new ListNode(1);
			 ListNode node2= new ListNode(2);
			 ListNode node3= new ListNode(3);
			 ListNode node4= new ListNode(4);
			 ListNode node5= new ListNode(5);
			 ListNode node6= new ListNode(6);
			 node1.next=node2;
			 node2.next=node3;
			 node3.next=node4;
			 node4.next=node5;	
			 node5.next=node6;	
			ListNode result = middleOfList.middleNode(node1);
			assertEquals(node4, result); 
			assertEquals(node5, node4.next);
			assertEquals(node6, node5.next); 
			assertNull(node6.next);
		
	}


}
