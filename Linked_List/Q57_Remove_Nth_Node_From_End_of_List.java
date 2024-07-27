package Linked_List;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Q57_Remove_Nth_Node_From_End_of_List {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)return null;
         ListNode f=head;
        ListNode e=head;
       

        while(n>0){
            f=f.next;
            n--;
        }
        if(f==null)return head.next;
        
        while(f.next!=null){
            e=e.next;
            f=f.next;
        }
       e.next=e.next.next;
        
        return head;
        
    }
}
}
