class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length == 1)
        {
            return 1;
        }
        if(nums.length == 2)
        {
            return 2;
        }
        int curr = 2;
        int max = 2;
        for(int i = 2 ; i < nums.length ; i++)
            {
               if(nums[i] == nums[i-1]+nums[i-2])
               {
                   curr++;
               }
                if(nums[i] != nums[i-1]+nums[i-2])
                {
                    curr = 2;
                }
                max = Math.max(curr,max);
                
            }
        return max;
    }
}