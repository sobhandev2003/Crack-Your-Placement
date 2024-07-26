package Linked_List;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Q55_Reverse_Linked_List_II {
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
        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode temp = head;
            int pos = 1;
            while (temp.next != null && pos < left - 1) {
                temp = temp.next;
                pos++;
            }
            ListNode end = temp;
            while (end != null && pos <= right) {
                end = end.next;
                pos++;
            }

            if (left == 1) {
                head = reverse(temp, left, right);
            } else {
                temp.next = reverse(temp.next, left, right);
            }

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = end;

            return head;
        }

        private ListNode reverse(ListNode root, int s, int end) {
            ListNode pre = null;
            while (root != null && s <= end) {
                ListNode next = root.next;
                root.next = pre;
                pre = root;
                root = next;
                s++;
            }
            return pre;
        }
    }
}
