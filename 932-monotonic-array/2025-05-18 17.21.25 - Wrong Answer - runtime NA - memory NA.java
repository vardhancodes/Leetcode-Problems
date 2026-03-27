class Solution {
    public boolean isMonotonic(int[] nums) {

        for(int i = 1; i < nums.length-1; i++)
        {
            if((nums[i] > nums[i + 1] && nums[i] > nums[i - 1]) || 
               (nums[i] < nums[i + 1] && nums[i] < nums[i-1]))
            {
                return false;
            }
        }

        return true;
        
    }
}