import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Q14_4Sum
 */
public class Q14_4Sum {
//LINK - https://leetcode.com/problems/4sum/description/
//LINK - LeetCode Solution => https://leetcode.com/problems/4sum/solutions/5484485/beats-80-2-simple-solution-two-pointer-recursion
//NOTE time complexity:- O(n^3) 
//NOTE - Code 1 - Recursion
class Solution {
    boolean[][] vis;

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        if (n < 4)
            return new ArrayList<>(ans);
        vis = new boolean[n][n];
        helper(nums, 0, n - 1, (long) target, ans);
        return new ArrayList<>(ans);
    }

    private void helper(int nums[], int i, int j, long target, Set<List<Integer>> ans) {
        if (i >= j)
            return;
        if (vis[i][j])
            return;
        vis[i][j] = true;
        int k = i + 1;
        int l = j - 1;
        long sum = (long) nums[i] + (long) nums[j];
        while (k < l) {
            long temp = sum + ((long) nums[k] + (long) nums[l]);
            if (temp == target) {
                ans.add(Arrays.asList(nums[i], nums[k], nums[l], nums[j]));
                while (k < l && nums[k] == nums[k + 1])
                    k++;
                while (l > k && nums[l] == nums[l - 1])
                    l--;
                k++;
                l--;
            } else if (temp < target) {
                k++;
            } else {
                l--;
            }
        }
        helper(nums, i, j - 1, target, ans);
        helper(nums, i + 1, j, target, ans);
        helper(nums, i + 1, j - 1, target, ans);
    }
}

//NOTE - Code -2 ==================================================

class Solution {
    boolean[][] vis;

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        if (n < 4)
            return ans;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                long sum = (long) nums[i] + (long) nums[j];
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long temp = sum + ((long) nums[k] + (long) nums[l]);
                    if (temp == target) {
                        ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], nums[l])));

                        while (k < l && nums[k] == nums[k + 1])
                            k++;
                        while (l > k && nums[l] == nums[l - 1])
                            l--;
                        k++;
                        l--;
                    } else if (temp < target) {
                        k++;

                    } else {
                        l--;

                    }
                }
            }
        }

        return  ans;
    }

}

}