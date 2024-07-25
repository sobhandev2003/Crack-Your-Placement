package Linked_List;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Q51_Reverse_Linked_List {
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
        private ListNode ans;

        public ListNode reverseList(ListNode head) {
            while (head != null) {
                insertFirst(head.val);
                head = head.next;
            }
            return ans;

        }

        public void insertFirst(int value) {
            ListNode node = new ListNode(value);
            node.next = ans;
            ans = node;
        }
    }
}
