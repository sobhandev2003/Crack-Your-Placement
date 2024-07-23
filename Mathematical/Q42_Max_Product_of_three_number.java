package Mathematical;

import java.util.Arrays;

public class Q42_Max_Product_of_three_number {
    // LINK - https://leetcode.com/problems/maximum-product-of-three-numbers/
    class Solution {
        public int maximumProduct(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            int max = Integer.MAX_VALUE;
            int max1 = nums[0] * nums[1] * nums[2];
            int max2 = nums[n - 1] * nums[n - 2] * nums[n - 3];
            max = Math.max(max1, max2);
            max1 = nums[0] * nums[1] * nums[n - 1];
            max = Math.max(max, max1);
            max1 = nums[0] * nums[n - 2] * nums[n - 1];
            max = Math.max(max, max1);

            return max;
        }
    }
}
