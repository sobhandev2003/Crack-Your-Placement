/**
 * Q12_Container_With_Most_Water
 */
public class Q12_Container_With_Most_Water {
    // LINK - https://leetcode.com/problems/container-with-most-water/
    class Solution {
        public int maxArea(int[] height) {
            int i = 0, j = height.length - 1;
            int max = 0;
            while (i < j) {
                if (height[i] < height[j]) {
                    max = Math.max(max, (j - i) * height[i]);
                    i++;
                } else {
                    max = Math.max(max, (j - i) * height[j]);
                    j--;
                }
            }
            return max;
        }
    }

}