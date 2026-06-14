class Solution {
    public void moveZeroes(int[] nums) {
        int fill = 0;
        int find = 0;
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