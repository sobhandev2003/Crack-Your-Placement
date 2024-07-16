import java.util.HashMap;

public class Q16_Subarray_Sum_Equals_K {
    // LINK - https://leetcode.com/problems/subarray-sum-equals-k/
    //LINK -LeetCode - https://leetcode.com/problems/subarray-sum-equals-k/solutions/5484782/beats-92-simple-solution-hashmap-prefix-sum
    class Solution {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> set = new HashMap<>();
            int sum = 0;
            int n = nums.length;
            set.put(0, 1);
            int ans = 0;
            for (int i = 0; i < n; i++) {
                sum += nums[i];
                if (set.containsKey(sum - k)) {
                    ans += set.get(sum - k);
                }
                set.put(sum, set.getOrDefault(sum, 0) + 1);
            }
            return ans;
        }
    }
}
