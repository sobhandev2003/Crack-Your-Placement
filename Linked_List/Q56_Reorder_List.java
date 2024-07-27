package Linked_List;

/**
 * Q56_Reorder_List
 */
public class Q56_Reorder_List {

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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode first=head;
        while(first!=null&&first.next!=null){
            slow=slow.next;
            first=first.next.next;
        }
        //  System.out.println(slow.val);
        ListNode th=reverse(slow);
        ListNode temp=head;
        while(th.next!=null){
             ListNode node=temp.next;
             temp.next=th;
              th=th.next;
              temp.next.next=node;
              temp=temp.next.next;
                
                
        }
        
       
    }

    ListNode reverse(ListNode node)
    {
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}
}