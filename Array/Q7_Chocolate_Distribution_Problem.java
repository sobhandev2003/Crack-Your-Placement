import java.util.ArrayList;
import java.util.Collections;

public class Q7_Chocolate_Distribution_Problem {
    // LINK -https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
    class Solution {
        public long findMinDiff(ArrayList<Integer> a, int n, int m) {
            Collections.sort(a);
            int min = a.get(m - 1) - a.get(0);
            int i = 1, j = m;

            while (j < n) {

                int diff = a.get(j) - a.get(i);
                if (min > diff) {
                    min = diff;
                }
                i++;
                j++;
            }

            return min;
        }
    }

}
