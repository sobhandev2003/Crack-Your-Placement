package Matrix;

public class Q35_Rotate_Image {
    //LINK - https://leetcode.com/problems/rotate-image/
    class Solution {
        public void rotate(int[][] matrix) {
            int n=matrix.length; 
            int m=matrix[0].length;
            int t=0;
            int b=m-1;
            while(t<b){
                for(int i=0;i<m;i++){
                  matrix[t][i]=matrix[t][i]^matrix[b][i];
                    matrix[b][i]=matrix[t][i]^matrix[b][i];
                    matrix[t][i]=matrix[t][i]^matrix[b][i];
                }
                t++;
                b--;
            }
            for(int r=0;r<n;r++){
                for(int c=r+1;c<m;c++){
                    matrix[r][c]=matrix[r][c]^matrix[c][r];
                    matrix[c][r]=matrix[r][c]^matrix[c][r];
                    matrix[r][c]=matrix[r][c]^matrix[c][r];;
                }
            }
        }
    }
}
