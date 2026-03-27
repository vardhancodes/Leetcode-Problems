class Solution {
    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        if(nums.length ==1)
        {
            return nums[0];
        }
        if(nums.length == 2)
        {
            return Math.max(nums[0],nums[1]);
        }

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
        return thirdMax;

    }
}