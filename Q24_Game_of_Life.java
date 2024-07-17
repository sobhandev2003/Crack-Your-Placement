import java.util.Arrays;

public class Q24_Game_of_Life {
    //LINK - https://leetcode.com/problems/game-of-life/
    class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[] pre = new int[m];
        for (int i = 0; i < n; i++) {

            int[] temp = Arrays.copyOf(board[i], m);
            int precol=0;
            for (int j = 0; j < m; j++) {

                int live = 0, ded = 0;
                if (i - 1 >= 0) {
                        if (pre[j] == 1) {
                            live += 1;
                        } else {
                            ded += 1;
                        }

                    if (j - 1 >= 0) {
                        if (pre[j - 1] == 1) {
                            live += 1;
                        } else {
                            ded += 1;
                        }
                    }
                    if (j + 1 < m) {
                        if (pre[j + 1] == 1) {
                            live += 1;
                        } else {
                            ded += 1;
                        }
                    }
                }

                // ---------------------------------------
                if (i + 1 < n) {
                        if (board[i + 1][j] == 1) {
                            live += 1;
                        } else {
                            ded += 1;
                        }
                    if (j - 1 >= 0) {
                        if (board[i + 1][j - 1] == 1) {
                            live += 1;
                        } else {
                            ded += 1;
                        }
                    }
                    if (j + 1 < m) {
                        if (board[i + 1][j + 1] == 1) {
                            live += 1;
                        } else {
                            ded += 1;
                        }
                    }
                }

                // ===============================================
                if (j + 1 < m) {
                   
                    if (board[i][j + 1] == 1) {
                        live += 1;
                    } else {
                        ded += 1;
                    }
                }
                if (j - 1 >= 0) {
                    if (precol == 1) {
                        live += 1;
                    } else {
                        ded += 1;
                    }
                }
                //========================================
                precol=board[i][j];
                //========================================
                if (live < 2 || live > 3)
                    board[i][j] = 0;
                else if (live == 3)
                    board[i][j] = 1;
            }
            pre = Arrays.copyOf(temp, m);
        }
    }
}
}
