class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = 0;
        int sellDay = 0;
        int potentialBuy = 0;
        for (int i=1; i<prices.length; ++i) {
            if (prices[i] - prices[potentialBuy] > prices[sellDay] - prices[buyDay]) {
                buyDay = potentialBuy;
                sellDay = i;
            } else if (prices[i] < prices[buyDay]) {
                potentialBuy = i;
            }
        }
        return prices[sellDay] - prices[buyDay];
    }
}
