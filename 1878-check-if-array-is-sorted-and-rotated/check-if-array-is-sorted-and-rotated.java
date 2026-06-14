class Solution {
    public boolean check(int[] nums) {
        int dip = 0;
        if(nums[0] < nums[nums.length-1])
        {
            dip++;
        }
        for(int i = 1 ; i < nums.length ; i++)
        {
            if(nums[i] < nums[i-1])
            {
                dip++;
            }
        }

        return dip < 2;

    }
}