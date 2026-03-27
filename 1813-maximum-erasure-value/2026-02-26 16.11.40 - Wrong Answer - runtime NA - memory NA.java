class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int windowStart = 0;
        int windowEnd = 0;
        int dcc = 0;
        int ans = 0;
        int currsum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(windowEnd < nums.length)
        {
            if(map.containsKey(nums[windowEnd]))
            {
                dcc++;
            }
            map.put(nums[windowEnd],map.getOrDefault(nums[windowEnd],0)+1);
            currsum += nums[windowEnd];
            if(dcc > 0)
            {
                while(dcc > 0)
                {
                    if(map.get(nums[windowStart]) > 1)
                    {
                        map.put(nums[windowStart],map.getOrDefault(nums[windowStart],
0)-1);
                        dcc--;
                    }
                    currsum -= nums[windowStart];
                    windowStart++;
                }
            }
            ans = Math.max(ans,currsum);
            windowEnd++;
        }

        return ans;
        
    }
}