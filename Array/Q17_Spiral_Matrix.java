import java.util.ArrayList;
import java.util.List;

public class Q17_Spiral_Matrix {
    // LINK - https://leetcode.com/problems/spiral-matrix/
    //LINK - LeetCode solution- https://leetcode.com/problems/spiral-matrix/solutions/5484907/beats-100-simple-solution
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<>();
            int l = 0, r = 0, d = 0, u = 0;
            int dir = 0;
            int n = matrix.length, m = matrix[0].length;
            int row = 0, col = 0;
            while ((n * m) > ans.size()) {
                if (dir == 0) {
                    while (col < (m - d)) {
                        ans.add(matrix[row][col++]);
                    }
                    row++;
                    col--;
                    dir++;
                    l++;
                } else if (dir == 1) {
                    while (row < (n - r)) {
                        ans.add(matrix[row++][col]);
                    }
                    row--;
                    col--;
                    d++;
                    dir++;
                } else if (dir == 2) {
                    while (col >= u) {
                        ans.add(matrix[row][col--]);
                    }
                    row--;
                    col++;
                    r++;
                    dir++;
                } else if (dir == 3) {
                    while (row >= l) {
                        ans.add(matrix[row--][col]);
                    }
                    row++;
                    col++;
                    u++;
                    dir++;
                }

                dir %= 4;
            }
            return ans;
        }
    }
}
