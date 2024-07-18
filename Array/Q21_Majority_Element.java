public class Q21_Majority_Element {
    // LINK - https://leetcode.com/problems/majority-element/
    class Solution {
        public int majorityElement(int[] nums) {

            int cnd = nums[0];
            int v = 1;
            for (int num : nums) {
                if (cnd == num)
                    v++;
                else {
                    v--;
                    if (v == 0) {
                        cnd = num;
                        v = 1;
                    }
                }
            }
            return cnd;
        }
    }
}
