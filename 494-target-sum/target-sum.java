class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalsum = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            totalsum += nums[i];
        }
        if((totalsum-target)%2 != 0 || Math.abs(target) > totalsum)  return 0;
        int t = (totalsum-target)/2;
        int dp[][] = new int[nums.length+1][t+1];
        for(int rows[] : dp)
        {
            Arrays.fill(rows,-1);
        }
        return recur(nums,nums.length,t,dp);
    }

    public static int recur(int[] nums, int n, int t, int dp[][])
    {
        if(n == 0)
        {
            if(t == 0)
            {
                dp[n][t] = 1;
                return 1;
            }
            else
            {
                dp[n][t] = 0;
                return 0;
            }
        }
        if(dp[n][t] != -1)
        {
            return dp[n][t];
        }

        if(nums[n-1] <= t)
        {
            dp[n][t] = recur(nums,n-1,t-nums[n-1],dp)+recur(nums,n-1,t,dp);
            return dp[n][t];
        }
        
        else
        {
            dp[n][t] = recur(nums,n-1,t,dp);
            return dp[n][t];
        }
        
    }
}