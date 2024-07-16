/**
 * Q14_Maximum_Points_You_Can_Obtain_from_Cards
 */
public class Q15_Maximum_Points_You_Can_Obtain_from_Cards {
//LINK - https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
class Solution {
    public int maxScore(int[] cp, int k) {
        int n=cp.length;
        int totalSum=0;
        for(int p:cp)totalSum+=p;
        if(n==k)return totalSum;
        int max=-1;
       int temp=0;
        int window=0;
        int s=0;
        for(int i=0;i<n;i++){
            temp+=cp[i];
            window++;
            if((n-k)==window){
                    max=Math.max(max,totalSum-temp);
                    temp-=cp[s++];
                    window--;
            }
        }
   
        return max;
    }
}
    
}
