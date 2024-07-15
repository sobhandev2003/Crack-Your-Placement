public class Q3_Remove_Duplicates_from_Sorted_Array {
    //LINK - https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    class Solution {
        public int removeDuplicates(int[] nums) {
            int n=nums.length;
            int len=1;
            for(int i=1,k=1;i<n;i++){
                if(nums[i]==nums[i-1])continue;
                nums[k++]=nums[i];
                len++;
            }
            return len;
        }
    }

}
