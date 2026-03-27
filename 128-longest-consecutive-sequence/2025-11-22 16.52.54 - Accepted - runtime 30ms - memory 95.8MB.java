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
        for(int num : set)
        {
            int prev = num-1;
            if(!set.contains(prev))
            {
                int len = 1;
                int el = num;
                while(set.contains(el+1))
                {
                    len++;
                    el++;
                }
                ans = Math.max(len,ans);
            }
        }
        return ans;
    }
}