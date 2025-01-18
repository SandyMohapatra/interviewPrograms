package com.demo.interview.ds;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1,
				new ListNode(2, 
						new ListNode(3, 
								new ListNode(4, 
										new ListNode(5)))));
		ListNode res = reverseList(l1,1,6);
		while (res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}
	
	public static ListNode reverseList(ListNode head, int left, int right) {
		
		ListNode curr = head;
		ListNode next = null;
		int idx = 1;
		ListNode prev = null;
		while (idx < left) {
			prev = curr;
			curr = curr.next;
			idx++;
		}
		ListNode startNode = prev;
		ListNode leftNode = curr;
		while (idx < right && curr.next !=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			idx++;
		}
		ListNode rightNode = curr.next;
		curr.next = prev; 
		if (startNode != null) {
			startNode.next = curr;
		} else {
			return curr;
		}
		leftNode.next = rightNode;
		if (left > 2) {
			return head;
		}
		return startNode;
	}
	
	public static ListNode fullRev(ListNode head) {
		ListNode curr = head.next;
		ListNode next = null;
		ListNode prev = head;
		int idx = 1;
		while (curr.next !=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		curr.next = prev; 
		head.next = null;
		return curr;
	}

}
