class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int ans = 1;
       for(int i = 0 ; i < nums.length ; i++)
       {
            if(nums[i] != nums[index])
            {
                index++;
                nums[index] = nums[i];
                ans++;
            }
       }

       return ans;
    }
}