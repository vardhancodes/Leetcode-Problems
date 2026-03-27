class Solution {
    public int removeDuplicates(int[] nums) {
        int ans = 0;
        int start = 0;
        int dup = 0;
        int end = 1;
        while(end < nums.length)
        {
            if(nums[end] == nums[start])
            {
                dup++;
                end++;
            }
            else
            {
                start++;
                nums[start] = nums[end];
            }
        }
        return dup;
    }
}