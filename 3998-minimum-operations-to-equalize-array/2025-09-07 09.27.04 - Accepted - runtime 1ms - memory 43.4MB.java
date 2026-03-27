class Solution {
    public int minOperations(int[] nums){
        int target = nums[0];
        boolean equal = true;
        for(int i = 1 ; i < nums.length ; i++)
            {
                if(nums[i] != nums[0])
                {
                    equal = false;
                    break;
                }
            }
        if(equal)
        {
            return 0;
        }
        return 1;
    }
}