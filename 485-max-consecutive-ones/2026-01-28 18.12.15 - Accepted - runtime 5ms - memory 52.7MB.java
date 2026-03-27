class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0;
        int end = 0;
        int ans = 0;
        while(end < nums.length)
        {
            if(nums[end] == 1)
            {
                end++;
            }
            else
            {
                end++;
                start = end;
            }
            ans = Math.max(end-start,ans);
        }
        return ans;
    }
}