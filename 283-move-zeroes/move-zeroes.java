class Solution {
    public void moveZeroes(int[] nums) {
        int fill = 0;
        while(fill < nums.length && nums[fill] != 0)
        {
            fill++;
        }
        if(fill >= nums.length)
        {
            return;
        }
        int find = fill;
        while(find < nums.length)
        {
            if(nums[find] != 0)
            {
                int temp = nums[fill];
                nums[fill] = nums[find];
                nums[find] = temp;                                                       
                fill++;
            }
            find++;
        }
    }
}