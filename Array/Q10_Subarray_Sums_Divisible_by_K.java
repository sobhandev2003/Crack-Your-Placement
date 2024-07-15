
public class Q10_Subarray_Sums_Divisible_by_K {
    // LINK - https://leetcode.com/problems/subarray-sums-divisible-by-k/
    class Solution {
        public int subarraysDivByK(int[] nums, int k) {
            int[] cnt = new int[k];
            cnt[0] = 1;
            int sum = 0;
            int ans = 0;
            for (int x : nums) {
                sum = ((sum + x) % k);
                if (sum < 0) {
                    sum += k;
                }
                ans += cnt[sum];
                cnt[sum]++;
            }

            return ans;
        }
    }

}