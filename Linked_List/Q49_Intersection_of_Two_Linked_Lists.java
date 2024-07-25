package Linked_List;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Q49_Intersection_of_Two_Linked_Lists {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int lenA = 0, lenB = 0;
            ListNode tempA = headA;
            ListNode tempB = headB;
            while (tempA != null) {
                lenA++;
                tempA = tempA.next;
            }
            while (tempB != null) {
                lenB++;
                tempB = tempB.next;
            }
            while (lenA > lenB) {
                lenA--;
                headA = headA.next;
            }
            while (lenA < lenB) {
                lenB--;
                headB = headB.next;
            }
            while (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }
            return headA;
        }
    }
}
