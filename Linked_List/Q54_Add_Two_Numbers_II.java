package Linked_List;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Q54_Add_Two_Numbers_II {
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
    ListNode ans;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
    
        l1=revers(l1);
        l2=revers(l2);
        int sum=0;
      while(l1!=null && l2!=null){
          sum=sum+l1.val+l2.val;
          insertFirst(sum%10);
          sum/=10;
          l1=l1.next;
          l2=l2.next;
      }
      while(l1!=null){
        sum=sum+l1.val;
          insertFirst(sum%10);
          sum/=10;
          l1=l1.next;  
      }
      while(l2!=null){
        sum=sum+l2.val;
          insertFirst(sum%10);
          sum/=10;
          l2=l2.next;  
      }
      while(sum>0){
          insertFirst(sum%10);
          sum/=10;
      }
        return ans;
    }
    private ListNode revers(ListNode head){
         if(head == null){
            return head;
        }
        ListNode pre=null;
        ListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
     private void insertFirst(int val){
        ListNode node=new ListNode(val);
        if(ans==null){
            ans=node;     
            return;
        }
        node.next=ans;
        ans=node;
       
       return;
    }
}
}
