class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int windowStart = 0;
        int windowEnd = 0;
        if(k <= 1) return 0;
        int ans = 0;
        int product = 1;
        while(windowEnd < nums.length)
        {
            product *= nums[windowEnd];
            if(product >= k)
            {
                while(product >= k)
                {
                    product /= nums[windowStart];
                    windowStart++;
                }
            }
            ans += windowEnd-windowStart+1;
            windowEnd++;
        }

        return ans;
    }
}