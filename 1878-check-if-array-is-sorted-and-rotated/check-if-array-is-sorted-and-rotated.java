class Solution {
    public boolean check(int[] nums) {
        if(nums.length == 1) return true;
        int length = 1;
        int n = nums.length;
        for(int i = 1 ; i < (n*2) ; i++)
        {
            
            if(nums[(i-1)%n] <= nums[i%n])
            {
                length++;
            }
            else
            {
                length = 1;
            }

            if(length == nums.length)
            {
                return true;
            }
           
        }

        return false;
    }
}