import java.util.PriorityQueue;

public class Q25_Max_Value_of_Equation {
    //LINK - https://leetcode.com/problems/max-value-of-equation/
    class Solution {
        public int findMaxValueOfEquation(int[][] points, int k) {
    
            int max = Integer.MIN_VALUE;
            int n = points.length;
            PriorityQueue<int[]> qu = new PriorityQueue<>((a, b) -> b[0] - a[0]);
            for (int[] point : points) {
                while(!qu.isEmpty() && (point[0]-qu.peek()[1])>k){
                    qu.poll();
                }
                if(!qu.isEmpty()){
                    int res=point[0]+point[1]+qu.peek()[0];
                    max=Math.max(max,res);
                }
                qu.add(new int[] { point[1] - point[0], point[0] });
            }
        
            return max;
        }
    }
}
