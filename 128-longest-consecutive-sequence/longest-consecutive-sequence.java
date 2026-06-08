class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            set.add(nums[i]);
        }
        int ans = 0;
        for(int num : set)
        {
            if(set.contains(num-1))
            {
                continue;
            }
            else
            {
                int count = 1;
                int start = num;
                while(set.contains(start+1))
                {
                   
                    count++;
                    start++;
                }
                ans = Math.max(count,ans);
                
            }
            
            
        }

        return ans;
    }
}