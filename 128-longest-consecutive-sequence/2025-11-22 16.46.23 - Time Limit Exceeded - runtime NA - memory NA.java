class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 1;
        if(nums.length == 0)
        {
            return 0;
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            set.add(nums[i]);   
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(set.contains(nums[i]-1))
            {
                continue;
            }
            else
            {
                int len = 1;
                int num = nums[i];
                while(set.contains(num+1))
                {
                    len++;
                    num++;
                }
                ans = Math.max(len,ans);
            }
        }
        return ans;
    }
}