public class Q1_Find_the_Duplicate_Number {
    //LINK - https://leetcode.com/problems/find-the-duplicate-number/
    class Solution {
        public int findDuplicate(int[] nums) {
            int n=nums.length;
          for(int i=0;i<n;i++){
            int j=Math.abs(nums[i]);
            if(nums[j]<0){
                return j;
            }
            nums[j]=-nums[j];
          }
          return -1;
        }
    }
}
