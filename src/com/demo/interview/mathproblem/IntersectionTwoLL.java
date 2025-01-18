package com.demo.interview.mathproblem;

import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class IntersectionTwoLL {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ListNode l1 = new ListNode(12, new ListNode(5, new ListNode(6)));
        ListNode l2 = new ListNode(5, new ListNode(15, new ListNode(6)));
        Set<Integer> res = intersectTwoLL(l1, l2);
        for (Integer n: res) {
            System.out.println(n);
        }
    }

    public static Set<Integer> intersectTwoLL(ListNode l1, ListNode l2) {
        Set<Integer> listNum = new HashSet();
        Set<Integer> resNum = new HashSet();
        if (l1 == null || l2 == null) {
            System.out.println("No");
        } else {
            while (l1 != null) {
                listNum.add(l1.val);
                l1 = l1.next;
            }
            while (l2 != null) {
                if (listNum.contains(l2.val)) {
                    resNum.add(l2.val);
                }
                l2 = l2.next;
            }

        }
        return resNum;
    }

}
