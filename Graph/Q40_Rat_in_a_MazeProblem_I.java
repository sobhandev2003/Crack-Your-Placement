package Graph;

import java.util.ArrayList;

public class Q40_Rat_in_a_MazeProblem_I {

    // User function Template for Java

    // m is the given matrix and n is the order of matrix
    class Solution {
        public static ArrayList<String> findPath(int[][] m, int n) {
            // Your code here
            ArrayList<String> list = new ArrayList<>();
            helper(m, list, 0, 0, "");
            // System.out.println(list.size());
            if (list.size() == 0) {

                list.add("-1");
            }
            return list;

        }

        private static void helper(int[][] m, ArrayList<String> list, int r, int c, String p) {
            if (m[r][c] == 0) {
                return;
            }
            if (r == m.length - 1 && c == m[0].length - 1) {
                list.add(p);
            }

            if (r < m.length - 1) {
                m[r][c] = 0;
                helper(m, list, r + 1, c, p + "D");
                m[r][c] = 1;
            }
            if (c < m[0].length - 1) {
                m[r][c] = 0;
                helper(m, list, r, c + 1, p + "R");
                m[r][c] = 1;

            }
            if (r > 0) {
                m[r][c] = 0;
                helper(m, list, r - 1, c, p + "U");
                m[r][c] = 1;
            }
            if (c > 0) {
                m[r][c] = 0;
                helper(m, list, r, c - 1, p + "L");
                m[r][c] = 1;
            }

            return;

        }
    }
}
