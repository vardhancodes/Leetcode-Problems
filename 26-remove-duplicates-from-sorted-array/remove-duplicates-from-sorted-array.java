class Solution {
    public int removeDuplicates(int[] nums) {
        int fill = 0;
        int find = 1;
        while(find < nums.length)
        {
            if(nums[fill] != nums[find])
            {
                fill++;
                nums[fill] = nums[find];
            }
            find++;
        }

        return fill+1;
    }
}