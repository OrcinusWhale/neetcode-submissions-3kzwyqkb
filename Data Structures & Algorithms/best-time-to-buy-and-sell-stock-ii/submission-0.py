class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        buy = -1
        for i in range(len(prices)-1):
            if buy == -1 and prices[i] < prices[i+1]:
                buy = prices[i]
            elif buy != -1 and prices[i] > prices[i+1]:
                profit += prices[i] - buy
                buy = -1
        if buy != -1:
            profit += prices[len(prices)-1] - buy
        return profit