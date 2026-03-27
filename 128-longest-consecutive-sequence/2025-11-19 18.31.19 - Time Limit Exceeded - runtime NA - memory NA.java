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
        int ans = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int count = 1;
            int element = nums[i];
            if(set.contains(element+1))
            {
                while(set.contains(element+1))
                {
                    count++;
                    element++;
                }
                
            }
            ans = Math.max(ans,count);

        }
        return ans;
    }
}