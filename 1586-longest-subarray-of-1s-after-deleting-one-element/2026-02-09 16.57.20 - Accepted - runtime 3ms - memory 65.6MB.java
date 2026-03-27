class Solution {
    public int longestSubarray(int[] nums) {
        int used = 0;
        int windowStart = 0;
        int windowEnd = 0;
        int ans = 0;

        while(windowEnd < nums.length)
        {
            if(nums[windowEnd] == 0)
            {
                used++;
            }

            if(used > 1)
            {
                ans = Math.max(ans,windowEnd - windowStart-1);
                while(used > 1)
                {
                    if(nums[windowStart] == 0)
                    {
                        used--;
                    }
                    windowStart++;
                }
            }
            ans = Math.max(ans,windowEnd - windowStart);
            windowEnd++;
        }
        return ans;
    }
}