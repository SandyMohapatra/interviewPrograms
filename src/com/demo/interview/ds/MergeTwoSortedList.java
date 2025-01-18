package com.demo.interview.ds;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ListNode list1 = new ListNode(1); list1.next = new ListNode(2, new
		 * ListNode(3));
		 * 
		 * ListNode list2 = new ListNode(1); list2.next = new ListNode(3, new
		 * ListNode(4));
		 */
		ListNode list1 = new ListNode(2);
		
		ListNode list2 = new ListNode(1);
		ListNode res = mergeTwoLists(list1, list2);
		while (res.next != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;
        ListNode resultHead = null;
        while (list1 != null) {
        	ListNode currNode = null;
        	if (list2 == null || list1.val <= list2.val) {
        		currNode = list1;
        		list1 = list1.next;
        	} else {
        		currNode = list2;
        		list2 = list2.next;
        	}
        	if (result == null) {
        		resultHead = currNode;
        		result = currNode;
        	} else {
        		result.next = currNode;
        		result = result.next;
        	}
        }
        while (list2 != null) {
        	if (result == null) {
        		resultHead = list2;
        		result = list2;
        	} else {
        		result.next = list2;
        		result = result.next;
        	}
        	list2 = list2.next;
        }
        return resultHead;
    }

}
