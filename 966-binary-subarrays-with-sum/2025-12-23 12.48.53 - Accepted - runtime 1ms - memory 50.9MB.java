class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numSubarraysWithAtmostKSum(nums,goal)-numSubarraysWithAtmostKSum(nums,goal-1);
    }
    public static int numSubarraysWithAtmostKSum(int[] nums, int goal)
    {
        int windowStart = 0;
        int windowEnd = 0;
        int n = nums.length;
        int ans = 0;
        int sum = 0;
        while(windowEnd < n)
        {
            sum += nums[windowEnd];
            if(sum > goal)
            {
                while(windowStart <= windowEnd && sum > goal)
                {
                    sum -= nums[windowStart];
                    windowStart++;
                }
            }
            ans += windowEnd - windowStart + 1;
            windowEnd++;

        }
        return ans;
    }
}