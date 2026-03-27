class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       return numberOfSubarrayswithAtmostKoddnumbers(nums,k)-numberOfSubarrayswithAtmostKoddnumbers(nums,k-1);
    }
    public static int numberOfSubarrayswithAtmostKoddnumbers(int nums[] , int k)
    {
        int windowStart = 0;
        int windowEnd = 0;
        int ans = 0;
        int n = nums.length;
        while(windowEnd < n)
        {
            if(nums[windowEnd]%2 != 0)
            {
                k--;
            }
            if(k < 0)
            {
                while(windowStart < windowEnd && k < 0)
                {
                    if(nums[windowStart]%2 != 0)
                    {
                        k++;
                    }
                    windowStart++;
                }
            }
            ans += windowEnd - windowStart + 1;
            windowEnd++;

        }
        return ans;
    }
}