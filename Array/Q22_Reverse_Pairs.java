public class Q22_Reverse_Pairs {
    //LINK - https://leetcode.com/problems/reverse-pairs/description/
    class Solution {
        public int reversePairs(int[] nums) {
            return divide(nums, 0, nums.length - 1);
        }
    
        private int divide(int[] nums, int s, int e) {
            int sum = 0;
            if (s < e) {
                int mid = s + (e - s) / 2;
                sum += divide(nums, s, mid);
    
                sum += divide(nums, mid + 1, e);
                sum += merge(nums, s, mid, e);
            }
            return sum;
        }
    
        private int merge(int[] arr, int l, int m, int r) {
    
            int n1 = m - l + 1;
            int n2 = r - m;
    
            int L[] = new int[n1];
            int R[] = new int[n2];
    
            for (int i = 0; i < n1; ++i)
                L[i] = arr[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[m + 1 + j];
    
            int i = 0, j = 0;
            int k = l;
            int cnt = 0;
            while (i < n1 && j < n2) {
                if ((long) L[i] > (long) (2 * (long) R[j])) {
                    cnt += n1 - i;
                    j++;
                } else
                    i++;
            }
            i = 0;
            j = 0;
            while (i < n1 && j < n2) {
    
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
    
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }
            while (j < n2) {
    
                arr[k] = R[j];
                j++;
                k++;
            }
            return cnt;
        }
    }
}
