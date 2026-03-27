class Solution {
    public int findTargetSumWays(int[] nums, int target) {
    int []count = new int[1];
    recur(nums,target,count,0);
    return count[0];
        
    }
    public void recur(int[] nums , int target , int[]count , int ind)
    {
        int n = nums.length;
        if(ind == n)
        {
            if(target == 0)
            {
                count[0]++;
            }
            return;
        }

        target-=nums[ind];
        recur(nums, target, count, ind+1);
        target+=nums[ind];
        target+=nums[ind];
        recur(nums, target, count, ind+1);

    }
}