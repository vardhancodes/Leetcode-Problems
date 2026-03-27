class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 1)
        {
            return (nums[0] == k)?1:0;
        }
        return uptosumk(nums,k)-uptosumk(nums,k-1);
    }

    public static int uptosumk(int[] nums, int k)
    {
        int windowStart = 0;
        int windowEnd = 0;
        int sum = 0;
        int ans = 0;

        while(windowEnd < nums.length)
        {
            sum += nums[windowEnd];
            if(sum > k)
            {
                while(sum > k)
                {
                    sum -= nums[windowStart];
                    windowStart++;
                }
            }            

            ans += windowEnd-windowStart+1;
            windowEnd++;
        }

        return ans;

    }
}