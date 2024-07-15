public class Q5_Move_Zeroes {
    //LINK - https://leetcode.com/problems/move-zeroes/
    class Solution {
        public void moveZeroes(int[] nums) {
            int n=nums.length;
            int zero=0;
            int k=0;
            for(int i=0;i<n;i++){
                if(nums[i]==0)zero++;
                else{
                    nums[k++]=nums[i];
                }
            }
            
            for(int i=0;i<zero;i++){
                nums[k++]=0;
            }
        }
    }
}
