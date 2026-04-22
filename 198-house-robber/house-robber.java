class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return recur(nums,0,dp);
        
    }

    public static int recur(int[] nums,int index, int []dp)
    {
        if(index >= nums.length)
        {
            return 0;
        }

        if(dp[index] != -1)
        {
            return dp[index];
        }

        int picking = recur(nums,index+2,dp)+nums[index];
        int notpicking = recur(nums,index+1,dp);   

        dp[index] = Math.max(picking,notpicking);
        return dp[index]; 

    }
}