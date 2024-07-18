public class Q18_Word_Search {
    //LINK - https://leetcode.com/problems/word-search/
    //LINK - Solution - https://leetcode.com/problems/word-search/solutions/5486033/beats-97-backtracking
    class Solution {
        public boolean exist(char[][] board, String word) {
            int n=board.length;
            int m=board[0].length;
            boolean [][] vis=new boolean[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(board[i][j]==word.charAt(0)){
                        if(find(board,word,i,j,0,vis)){
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    
        private boolean find(char[][]board,String word,int r,int c,int i,boolean vis[][]){
            if(i==word.length()-1)return true;
            vis[r][c]=true;
            //Right
            if(c+1<board[r].length && !vis[r][c+1] && board[r][c+1]==word.charAt(i+1) ){
                if(find(board,word,r,c+1,i+1,vis))return true;
            }
            //Down
             if(r+1<board.length && !vis[r+1][c] && board[r+1][c]==word.charAt(i+1) ){
                if(find(board,word,r+1,c,i+1,vis))return true;
            }
            //Left
             if(c-1>=0 && !vis[r][c-1] && board[r][c-1]==word.charAt(i+1) ){
                if(find(board,word,r,c-1,i+1,vis))return true;
            }
            //Up
             if(r-1>=0 && !vis[r-1][c] && board[r-1][c]==word.charAt(i+1) ){
                if(find(board,word,r-1,c,i+1,vis))return true;
            }
             vis[r][c]=false;
            return false;
        }
    }
}
