class Solution {
    public int longestBalanced(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            int count = 0;
            HashSet<Integer> set = new HashSet<>();
            set.add(nums[i]);
            if(nums[i]%2 == 0)
            {
                count++;
            }
            else
            {
                count--;
            }
            for(int j = i+1 ; j < nums.length ; j++)
            {

                if(nums[j]%2 == 0 && !set.contains(nums[j]))
                {
                    count++;
                }
                else if(nums[j]%2 != 0 && !set.contains(nums[j]))
                {
                    count--;
                }
                if(count == 0)
                {
                    ans = Math.max(ans,j-i+1);
                }
                set.add(nums[j]);
            }
        }
        return ans;
    }
}