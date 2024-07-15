public class Q6_Best_Time_to_Buy_and_Sell_Stock {
    // LINK - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    class Solution {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            int profit, maxprofit = 0, buy = Integer.MAX_VALUE, sell;
            for (int i = 0; i < n; i++) {
                if (prices[i] < buy) {
                    buy = prices[i];
                }
                profit = prices[i] - buy;
                maxprofit = Math.max(profit, maxprofit);

            }
            return maxprofit;
        }
    }
}
