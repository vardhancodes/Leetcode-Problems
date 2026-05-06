class Solution {
    public int removeDuplicates(int[] nums) {
        int fill = 0;
        int find = 1;
        while(find < nums.length)
        {
            if(nums[fill] == nums[find])
            {
                find++;
            }
            else
            {
                nums[fill+1] = nums[find];
                fill++;
                find++;
            }
        }

        return fill+1;
    }
}