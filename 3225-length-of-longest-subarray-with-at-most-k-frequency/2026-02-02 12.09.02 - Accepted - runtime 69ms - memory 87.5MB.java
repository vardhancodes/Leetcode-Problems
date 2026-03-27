class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        int windowStart = 0;
        int windowEnd = 0;
        int gadhe = 0;
        while(windowEnd < nums.length)
        {
            map.put(nums[windowEnd],map.getOrDefault(nums[windowEnd],0)+1);
            if(map.get(nums[windowEnd]) > k)
            {
                gadhe++;
            }
            if(gadhe > 0)
            {
                while(gadhe > 0)
                {
                    map.put(nums[windowStart],map.getOrDefault(nums[windowStart],0)-1);
                    if(map.get(nums[windowStart]) == k)
                    {
                        gadhe--;
                    }
                    windowStart++;
                }
            }
            
            ans = Math.max(windowEnd-windowStart+1,ans);
            windowEnd++;
        }
        return ans;
    }
}