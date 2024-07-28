package Linked_List;

/**
 * Q58_ Merge_k_Sorted_Lists
 */
public class Q58_ Merge_k_Sorted_Lists {

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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> l=new ArrayList<>();
        ListNode ans=null;
    for(ListNode list:lists){
        while(list!=null){
            l.add(list.val);
            list=list.next;
        }
    }
    ListNode pre=ans;
  
    Collections.sort(l);
    for(int i=0;i<l.size();i++){
             ListNode temp=new ListNode(l.get(i));
        
        if(ans==null){
            ans=temp;
        }
        else{
            pre.next=temp;
        }
          pre=temp;
    }

        return ans;

    }
}
}