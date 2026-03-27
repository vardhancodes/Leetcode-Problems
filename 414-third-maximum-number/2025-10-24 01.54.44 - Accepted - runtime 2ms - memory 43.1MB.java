class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if (nums[i] == max || nums[i] == secondMax || nums[i] == thirdMax) {
                continue;
            }
            if(max < nums[i])
            {
                thirdMax = secondMax;
                secondMax = max;
                max = nums[i];
            }
            else if(nums[i] < max && nums[i] > secondMax)
            {
                thirdMax = secondMax;
                secondMax = nums[i];
            }
            else if(nums[i] < max && nums[i] < secondMax && nums[i] > thirdMax)
            {
                thirdMax = nums[i];
            }

        }
        return (thirdMax==Long.MIN_VALUE)?(int)max:(int)thirdMax;

    }
}