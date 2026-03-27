class Solution {
    public int splitArray(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        if(k<2)
        {
            return nums[0];
        }
        else
        {
            for(int i = 1 ; i <= k ; i++)
            {
                sum+=nums[nums.length-i];

            }
        }
        return sum;
        
    }
}