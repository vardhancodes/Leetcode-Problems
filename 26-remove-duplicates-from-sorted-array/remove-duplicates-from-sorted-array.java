class Solution {
    public int removeDuplicates(int[] nums) {
        int find = 1;
        int fill = 0;
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