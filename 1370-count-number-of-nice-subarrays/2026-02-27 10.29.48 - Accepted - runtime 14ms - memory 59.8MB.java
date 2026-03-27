class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums,k)-atMostK(nums,k-1);

    }
    public static int atMostK(int[] nums, int k)
    {
        int windowStart = 0;
        int windowEnd = 0;
        int ans = 0;
        int count = 0;
        while(windowEnd < nums.length)
        {
            if(nums[windowEnd] %2 != 0)
            {
                count++;
            }

            if(count > k)
            {
                while(count > k)
                {
                    if(nums[windowStart] %2 != 0)
                    {
                        count--;
                    }
                    windowStart++;
                }
            }
            ans += windowEnd-windowStart+1;
            windowEnd++;
        }
        return ans;
    }
}