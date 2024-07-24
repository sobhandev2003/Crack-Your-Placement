package Linked_List;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Q45_Convert_Binary_Number_in_a_Linked_List_to_Integer {
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
        public int getDecimalValue(ListNode head) {
            int ans = 0;

            while (head != null) {

                ans = ans * 2 + head.val;
                head = head.next;
            }
            return ans;
        }
    }
}
