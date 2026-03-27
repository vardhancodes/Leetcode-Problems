class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int windowStart = 0;
        int windowEnd = 0;
        int n = nums.length;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        int check = 0;
        while(windowEnd < n)
        {
            check += nums[windowEnd];
            sum += nums[windowEnd];
            if(sum >= target)
            {
                int min = windowEnd-windowStart+1;
                ans = Math.min(min,ans);
                while(windowStart < windowEnd && sum >= target)
                {
                    sum -= nums[windowStart];
                    windowStart++;
                    if(sum >= target)
                    {
                        min = windowEnd - windowStart + 1;
                        ans = Math.min(ans,min);

                    }
                }
            }    
            windowEnd++;
        }
        if(check < target)
        {
            return 0;
        }
        return ans;
    }
}