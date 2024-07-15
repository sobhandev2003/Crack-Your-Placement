import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q13_3Sum {
    //LINK - https://leetcode.com/problems/3sum/
    class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> ans=new ArrayList<>();
         int n=nums.length;
         for(int i=0;i<n;i++){
            if(i>0 && nums[i-1]==nums[i])continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0)j++;
                else if(sum>0)k--;
                else{
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                     list.add(nums[j]);
                      list.add(nums[k]);
                      ans.add(list);
                    while(j<k-1 && nums[j]==nums[j+1])j++;
                    j++;
                     while(j<k-1 && nums[k]==nums[k-1])k--;
                    k--;
                }
            }
        }
        return ans;
    }
}
}
