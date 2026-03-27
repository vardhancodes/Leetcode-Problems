class Solution {
    public boolean find132pattern(int[] nums) {
        int start = 0 ; 
        int n = nums.length;
        int end = n-1;

        if(n < 3)
        {
            return false;
        }

        for(int i = 1 ; i < nums.length-1 ; i++)
        {
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1] && nums[i-1] < nums[i+1])
            {
                return true;
            }
        }

        return false;
    }
}