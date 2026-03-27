class Solution {
    public int longestOnes(int[] nums, int k) {
        int windowStart = 0;
        int windowEnd = 0;
        int n = nums.length;
        int ans = 0;
        while(windowEnd < n)
        {
            if(nums[windowEnd] != 1)
            {
                k--;
            }
            if(k < 0)
            {
                while(k < 0)
                {
                    int len = windowEnd-windowStart;
                    ans = Math.max(ans,len);
                    if(nums[windowStart] == 0)
                    {
                        k++;
                    }
                    windowStart++;
                }
            }
            windowEnd++;
        }
        return ans;

    }
}