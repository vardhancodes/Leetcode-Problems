class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0;
        ans+= numBottles;
        int empty = numBottles;
        while(empty >= numExchange)
        {
           ans+= (empty/numExchange);
           empty = (empty/numExchange) + (empty%numExchange);
        }
        return ans;
        
        
    }
}