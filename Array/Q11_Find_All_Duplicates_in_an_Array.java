import java.util.ArrayList;
import java.util.List;

/**
 * Q11_Find_All_Duplicates_in_an_Array
 */
public class Q11_Find_All_Duplicates_in_an_Array {
    // LINK - https://leetcode.com/problems/find-all-duplicates-in-an-array/
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> list = new ArrayList<>();
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                int x = Math.abs(nums[i]);
                if (nums[x - 1] < 0) {
                    list.add(x);
                }
                nums[x - 1] *= -1;
            }
            return list;
        }
    }

}