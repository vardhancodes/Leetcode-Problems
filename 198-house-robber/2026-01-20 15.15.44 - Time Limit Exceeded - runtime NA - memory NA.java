class Solution {
    public int rob(int[] nums) {
        int []ans = new int[1];
        recur(nums,0,0,ans);
        return ans[0];
    }

    public static void recur(int[] nums , int index , int sum , int[] ans)
    {
        if(index >= nums.length)
        {
            ans[0] = Math.max(ans[0],sum);
            return;
        }

        recur(nums,index+2,sum+nums[index],ans);
        recur(nums,index+1,sum,ans);
    }
}