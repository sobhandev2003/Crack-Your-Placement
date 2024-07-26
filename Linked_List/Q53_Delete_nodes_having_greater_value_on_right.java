package Linked_List;

/**
 * Q53_Delete_nodes_having_greater_value_on_right
 */
import java.util.*;
public class Q53_Delete_nodes_having_greater_value_on_right{

   
/*
 * class Node {
 * int data;
 * Node next;
 * 
 * Node(int data) {
 * this.data = data;
 * }
 * }
 */
class Solution {

    Node compute(Node head) {
        // your code here
        Node reHed = reverse(head);
        Node temp = reHed;
        Node ans = new Node(temp.data);
        temp = temp.next;
        while (temp != null) {
            if (temp.data >= ans.data) {
                Node newNode = new Node(temp.data);
                newNode.next = ans;
                ans = newNode;
            }
            temp = temp.next;
        }

        return ans;
    }

    private Node reverse(Node head) {
        Node temp = head;
        Node pre = null;
        while (temp != null) {
            Node temp2 = temp.next;
            temp.next = pre;
            pre = temp;
            temp = temp2;
        }
        return pre;
    }
}

}
