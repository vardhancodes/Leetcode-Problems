class Solution {
    public boolean check(int[] nums) {
        int count = 1;
        int k = nums.length;
        if(nums.length == 1)
        {
            return true;
        }
        for(int i = 1 ; i < k*2 ; i++)
        {
            if(nums[i%k] >= nums[(i-1)%k])
            {
                count++;
            }
            else
            {
                count = 1;
            }
            if(count == k)
            {
                return true;
            }
        }

        return false;                                                
    }               
}