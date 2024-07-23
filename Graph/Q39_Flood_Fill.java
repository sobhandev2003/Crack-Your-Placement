package Graph;

public class Q39_Flood_Fill {
    class Solution {
        int []topDown={1,-1,0,0};
        int []lefRight={0,0,1,-1};
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            if(image[sr][sc]==color)return image;
            helper(image,sr,sc,color);
            return image;
        }
        private void helper(int[][] image, int sr, int sc, int color){
            int pre=image[sr][sc];
            image[sr][sc]=color;
            for(int i=0;i<4;i++){
                int tr=sr+topDown[i];
                int tc=sc+lefRight[i];
                if(tr>=0 &&
                 tr<image.length &&
                 tc>=0 &&
                 tc<image[sr].length &&
                 image[tr][tc]==pre
                  )
                  {
                    helper(image,tr,tc,color);
                  }
            }
        }
    }
}
