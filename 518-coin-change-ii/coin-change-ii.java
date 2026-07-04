class Solution {
    public int change(int amount, int[] coins) {
        int dp[][] = new int[coins.length+1][amount+1];
        for(int[] row : dp)
        {
            Arrays.fill(row,-1);
        }
        return recur(coins.length,amount,coins,dp);
    }

    public static int recur(int n, int a, int[] coins, int[][] dp)
    {
        if(a == 0)
        {
            dp[n][a] = 1;
            return 1;
        }

        if(n == 0)
        {
            dp[n][a] = 0;
            return 0;
        }

        if(dp[n][a] != -1)
        {
            return dp[n][a];
        }

        if(coins[n-1] <= a)
        {
            return dp[n][a] = recur(n,a-coins[n-1],coins,dp)+recur(n-1,a,coins,dp);
        }

        else
        {
            return dp[n][a] = recur(n-1,a,coins,dp);
        }
    }
}