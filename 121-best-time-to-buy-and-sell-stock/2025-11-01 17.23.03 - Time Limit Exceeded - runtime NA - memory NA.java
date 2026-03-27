class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0 ; i < prices.length ; i++)
        {
            for(int j = i+1 ; j < prices.length ; j++)
            {
               int ans = prices[j] - prices[i];
               profit = Math.max(profit,ans);
            }
        }
        return profit;

        


        
    }
}