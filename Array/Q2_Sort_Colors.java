public class Q2_Sort_Colors {
    //LINK - https://leetcode.com/problems/sort-colors/description/

    class Solution {
        public void sortColors(int[] nums) {
            quickSort(nums,0,nums.length-1);
        }
    
        private void quickSort(int []nums,int s,int e){
            if(s<e){
                int pivot=position(nums,s,e);
                quickSort(nums,s,pivot-1);
                quickSort(nums,pivot+1,e);
            }
        }
        private int position(int []nums,int s,int e){
            int pivot=e;
            e--;
            while(s<=e){
                while(s<nums.length && nums[s]<nums[pivot]){
                    s++;
                }
                while(e>=0 && nums[e]>nums[pivot]){
                    e--;
                }
                if(s<=e){
                    swap(nums,s,e);
                    s++;
                    e--;
                }
    
            }
               swap(nums,s,pivot);
               return s;
    
        }
    
        private void swap(int []nums,int i,int j){
           int tem=nums[i];
           nums[i]=nums[j];
           nums[j]=tem; 
        }
    }
}
