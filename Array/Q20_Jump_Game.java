import java.util.Arrays;

public class Q20_Jump_Game {
    // LINK - https://leetcode.com/problems/jump-game/

// NOTE - Code 1 => Tabulation ===========================================
    class Solution {
        public boolean canJump(int[] nums) {
            int n = nums.length;
            boolean[] dp = new boolean[n];
            dp[n - 1] = true;
            for (int i = n - 2; i >= 0; i--) {
                int m = Math.min(i + nums[i], n - 1);
                for (int k = i + 1; k <= m; k++) {
                    if (dp[k]) {
                        dp[i] = true;
                        break;
                    }

                }
                if (dp[0])
                    return true;
            }
            return dp[0];
        }

    }

// NOTE - Code 2 => Memoization =====================================================
    class Solution {
        public boolean canJump(int[] nums) {

            int[] dp = new int[nums.length];
            Arrays.fill(dp, -1);
            return helper(nums, 0, dp);
        }

        private boolean helper(int[] nums, int i, int[] dp) {
            if (i >= nums.length - 1)
                return true;
            if (dp[i] != -1)
                return dp[i] == 1;
            for (int k = 0; k < nums[i]; k++) {
                if (helper(nums, i + nums[i] - k, dp)) {
                    dp[i] = 1;
                    return true;
                }
            }
            dp[i] = 0;
            return false;
        }
    }
}
