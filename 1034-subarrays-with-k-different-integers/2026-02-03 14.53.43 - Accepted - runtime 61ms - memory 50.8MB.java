class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return sliding(nums,k)-sliding(nums,k-1);
    }

    public static int sliding(int[] nums,int k)
    {
        int windowStart = 0;
        int windowEnd = 0;
        int ucc = 0;
        int ans = 0;
        int ptr = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(windowEnd < nums.length)
        {
            if(!map.containsKey(nums[windowEnd]))
            {
                ucc++;
            }
            map.put(nums[windowEnd],map.getOrDefault(nums[windowEnd],0)+1);
            if(ucc > k)
            {
                while(ucc > k)
                {
                    map.put(nums[windowStart],map.getOrDefault(nums[windowStart],0)-1);
                    if(map.get(nums[windowStart]) == 0)
                    {
                        ucc--;
                        map.remove(nums[windowStart]);
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