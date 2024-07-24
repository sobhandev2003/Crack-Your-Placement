package Linked_List;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Q46_Remove_Duplicates_from_Sorted_List {
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
        public ListNode deleteDuplicates(ListNode head) {
            ListNode ansHead = head;
            while (head != null && head.next != null) {
                if (head.val == head.next.val) {
                    head.next = head.next.next;
                    continue;
                }
                head = head.next;
            }
            return ansHead;

        }
    }
}
