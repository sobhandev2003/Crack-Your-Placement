package Matrix;

public class Q34_Number_of_Island {
    //LINK - https://leetcode.com/problems/number-of-islands/
    class Solution {
        static int[] rowNeabr={1,-1,0,0};
        static int[] columNeabr={0,0,1,-1};
        public int numIslands(char[][] grid) {
            int ans=0;
            int m=grid.length;
            int n=grid[0].length;
            boolean [][] vis=new boolean[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j]=='1'){
                        dfs(grid,i,j,m,n);
                        ans++;
                    }
                }
            }
    
            
    
    
            return ans;
        }
    
        private void dfs(char[][]grid,int r,int c,int m,int n){
       
             grid[r][c]='#';
             
            if(r+1<m && grid[r+1][c]=='1')
                dfs(grid,r+1,c,m,n);
            if(c+1<n && grid[r][c+1]=='1')
                dfs(grid,r,c+1,m,n);
            if(r-1>=0 && grid[r-1][c]=='1')
                dfs(grid,r-1,c,m,n); 
            if(c-1>=0 && grid[r][c-1]=='1')
                dfs(grid,r,c-1,m,n);               
            
               
    
        }
    }
}
