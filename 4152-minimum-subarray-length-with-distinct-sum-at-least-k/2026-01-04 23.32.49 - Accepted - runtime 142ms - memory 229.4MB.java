class Solution {
    public int minLength(int[] nums, int k) {
        int windowStart = 0;
        int windowEnd = 0;
        int ans = Integer.MAX_VALUE;
        int curr = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(windowEnd < nums.length)
        {   
            if(map.getOrDefault(nums[windowEnd],0) == 0)
            {
                sum += nums[windowEnd];
            }
            map.put(nums[windowEnd],map.getOrDefault(nums[windowEnd],0)+1);
            if(sum >= k)
            {
                curr = windowEnd-windowStart+1;
                ans = Math.min(ans,curr);
                while(windowStart <= windowEnd && sum >= k)
                {
                    if(map.getOrDefault(nums[windowStart],0) == 1)
                    {
                        sum -= nums[windowStart];
                    }
                    map.put(nums[windowStart],map.getOrDefault(nums[windowStart],0)-1);
                    curr = windowEnd-windowStart+1;
                    windowStart++;
                }
                ans = Math.min(ans,curr);
            }
            windowEnd++;
        }
        return (ans == Integer.MAX_VALUE)?-1:ans;
    }
}