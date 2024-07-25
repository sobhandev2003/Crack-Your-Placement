package Linked_List;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Q50_Palindrome_Linked_List {
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
        public boolean isPalindrome(ListNode head) {
            int len = 0;
            ListNode temp = head;
            while (temp != null) {
                len++;
                temp = temp.next;
            }
            int[] arr = new int[len];
            temp = head;
            int i = len - 1;
            while (temp != null) {
                arr[i--] = temp.val;
                temp = temp.next;
            }
            temp = head;
            int j = 0;
            int ch = 1;
            while (temp != null && j < len) {
                if (temp.val != arr[j]) {
                    return false;
                }
                temp = temp.next;
                j++;

            }
            return true;
        }
    }
}
