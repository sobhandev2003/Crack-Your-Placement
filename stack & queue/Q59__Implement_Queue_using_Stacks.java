

public class Q59__Implement_Queue_using_Stacks {
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    class MyQueue {
    Node start;
    Node end;
        public MyQueue() {
            
        }
        
        public void push(int x) {
            Node node=new Node(x);
            if(start==null){
                start=node;
                end=node;
            }
            else{
                end.next=node;
                end=node;
            }
    
        }
        
        public int pop() {
            int temp=start.val;
            start=start.next;
            return temp;
            
        }
        
        public int peek() {
            return start.val;
        }
        
        public boolean empty() {
            if(start==null){
                return true;
            }
            return false;
        }
    }
    
    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
}
