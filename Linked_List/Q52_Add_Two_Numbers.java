package Linked_List;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Q52_Add_Two_Numbers {
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
    ListNode ans=null;
    ListNode point=null;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
       
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+carry;
            System.out.println(sum);
            insert(sum%10);
            carry=sum/10;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            if(carry>0){
                int sum=l1.val+carry;
                insert(sum%10);
                carry=sum/10;
            }
            else{
                insert(l1.val);
            }
            
            l1=l1.next;
        }
        while(l2!=null){
            if(carry>0){
                int sum=l2.val+carry;
                insert(sum%10);
                carry=sum/10;
            }
            else{
                insert(l2.val);
            }
            
            l2=l2.next;
        }
        if(carry>0){
             insert(carry);
        }
        return ans;
    }

    private void insert(int val){
        ListNode node =new ListNode(val);
        if(ans==null){
            ans=node;
        }
        else{
            point.next=node;
        }
          point=node;
    }

}
}
