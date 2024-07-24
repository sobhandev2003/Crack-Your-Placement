package Linked_List;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Q43_Middle_of_the_Linked_List {
    // LINK - https://leetcode.com/problems/middle-of-the-linked-list/
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode middleNode(ListNode head) {
            int size = 0;
            ListNode ans = head;
            while (head.next != null) {
                ans = ans.next;
                head = head.next.next;
                if (head == null)
                    return ans;
            }

            return ans;

        }
    }

}
