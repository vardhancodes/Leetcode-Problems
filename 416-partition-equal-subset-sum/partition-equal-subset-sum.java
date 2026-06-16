class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            sum += nums[i];
        }
        if(sum %2 != 0)
        {
            return false;
        }
        Boolean dp[][] = new Boolean[nums.length+1][(sum/2)+1];
        for(Boolean[] row : dp)
        {
            Arrays.fill(row,null);
        }
        return recur(nums,nums.length,sum/2,dp);
    }

    public static boolean recur(int[] nums, int n, int sum, Boolean[][] dp)
    {
        if(sum == 0)
        {
            dp[n][sum] = true;
            return dp[n][sum];
        }

        if(n == 0)
        {
            dp[n][sum] = false;
            return dp[n][sum];
        }

        if(dp[n][sum] != null)
        {
            return dp[n][sum];
        }

        if(nums[n-1] <= sum)
        {
            return dp[n][sum] = recur(nums,n-1,sum-nums[n-1],dp)||recur(nums,n-1,sum,dp);
        }

        else
        {
            return dp[n][sum] = recur(nums,n-1,sum,dp);
        }
    }
}