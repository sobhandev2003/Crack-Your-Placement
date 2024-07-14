public class Q4_Set_Matrix_Zeroes {
    //LINK - https://leetcode.com/problems/set-matrix-zeroes/
    class Solution {
        public void setZeroes(int[][] matrix) {
            int m=matrix[0].length;
            int n=matrix.length;
            boolean []cach=new boolean[n+m];
    
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(matrix[i][j]==0){
                        cach[i]=true;
                        cach[n+j]=true;
                    }
                }
            }
            for(int i=0;i<n;i++){
                if(cach[i]){
                     for(int k=0;k<m;k++){
                        matrix[i][k]=0;
                    }
                }
            }
            for(int i=n;i<(n+m);i++){
                if(cach[i]){
                    for(int k=0;k<n;k++){
                        matrix[k][i-n]=0;
                    }
                }
            }
    
        }
    }
}
