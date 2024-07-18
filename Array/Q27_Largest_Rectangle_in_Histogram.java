import java.util.Stack;

public class Q27_Largest_Rectangle_in_Histogram {
    //LINK - https://leetcode.com/problems/largest-rectangle-in-histogram/
    class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>stk=new Stack<Integer> ();
        int n=heights.length;
        int []ls=new int[n];
        int []rs=new int[n];
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                ls[i]=0;
            }
            else{
                ls[i]=stk.peek()+1;
            }
            stk.push(i);
        }
        stk=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() &&  heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
              if(stk.isEmpty()){
                rs[i]=n-1;
            }
            else{
                rs[i]=stk.peek()-1;
            }
            stk.push(i);
        }
//     System.out.println(Arrays.toString(ls));
// System.out.println(Arrays.toString(rs));
    int maxA=-1;
    for(int i=0;i<n;i++){
        int area=(Math.abs(ls[i]-rs[i])+1)*heights[i];

        maxA=Math.max(area,maxA);
    }
        return maxA;
    }
}
}
