class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = -1;
        int max = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == 1)
            {
                max++;
            }
            else
            {
                ans = Math.max(ans,max);
                max = 0;
            }
        }

        ans = Math.max(ans,max);
        return ans;

    }
}