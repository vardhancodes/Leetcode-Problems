class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(max < nums[i])
            {
                max = nums[i];
            }
            if(min > nums[i])
            {
                min = nums[i];
            }
        }
        int div = 0;
        if(max%min == 0)
        {
            return min;
        }
        for(int i = 1 ; i < max ; i++)
        {
            if(min%i == 0 && max%i == 0)
            {
                div = i;
            }

        }

        return div;
        
    }
}