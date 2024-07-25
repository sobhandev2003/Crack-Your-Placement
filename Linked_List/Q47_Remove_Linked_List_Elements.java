package Linked_List;

import java.lang.classfile.components.ClassPrinter.ListNode;

/**
 * Q47_Remove_Linked_List_Elements
 */
public class Q47_Remove_Linked_List_Elements {
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
        public ListNode removeElements(ListNode head, int val) {
            if (head == null)
                return null;
            head.next = removeElements(head.next, val);
            if (head.val == val) {
                return head.next;
            } else {
                return head;
            }
        }
    }

}
