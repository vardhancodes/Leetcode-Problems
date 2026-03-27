class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);

            }
             
        }
        int ans = 1;
        int count = 1;
        for(int i = 0; i < nums.length; i++)
        {
            int element = nums[i];
            if(set.contains(element+1))
            {
                while(set.contains(element+1))
                {
                    count++;
                    element++;
                }
                ans = Math.max(ans,count);
                count = 1;
            }
            else
            {
                count = 1;
            }

        }
        return ans;
    }
}