class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ans = new int[2];
        for(int i =0 ; i<nums.length-1 ; i++ )
        {
            if(nums[i]+ nums[i+1] == target)
            {
                ans[0] = i;
                ans[1] = i+1;

            }

        }  

        return ans;      
    }
}