class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1; 
        int end = Integer.MIN_VALUE;
        int res = -1;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i]>end)
            {
                end = nums[i];
            }
        }

        while(start <= end)
        {
            int mid = (start+(end-start)/2);
            if(ismidvalid(mid , threshold , nums))
            {
                end = mid-1;
                res = mid;
            }
            else
            {
                start = mid+1;
            }
        }
        return res;
        
    }
    static boolean ismidvalid(int divisor , int threshold , int[] nums)
    {
        long ans = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            ans += nums[i]/divisor;
            if(nums[i]%divisor != 0)
            {
                ans += 1;
            }
            if(ans > threshold)
            {
                return false;
            }
        }
        return true;
    }
    
}