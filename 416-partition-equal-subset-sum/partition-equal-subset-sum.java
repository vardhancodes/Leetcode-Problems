class Solution {
    public boolean canPartition(int[] nums) {
        int target = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            target += nums[i];
        }
        if(target %2 != 0)
        {
            return false;
        }
        int sum = target/2;
        boolean[][] dp = new boolean[nums.length+1][sum+1];
        for(int i = 0 ; i < nums.length+1; i++)
        {
            for(int j = 0; j < sum+1 ; j++)
            {
                if(j == 0)
                {
                    dp[i][j] = true;                    
                }
                
                else if(i == 0)
                {
                    dp[i][j] = false;
                }
                
            }
        }
        
        
        for(int i = 1 ; i < nums.length+1 ; i++)
        {
            for(int j = 1 ; j < sum+1 ; j++)
            {
                if(nums[i-1] <= j)
                {
                    dp[i][j] = dp[i-1][j-nums[i-1]]||dp[i-1][j];
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        return dp[nums.length][sum];
    }
    
}