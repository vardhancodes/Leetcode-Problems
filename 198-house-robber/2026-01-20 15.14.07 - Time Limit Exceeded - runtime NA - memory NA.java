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

        for(int i = index ; i < nums.length ; i++)
        {
            sum += nums[i];
            recur(nums,i+2,sum,ans);
            sum -= nums[i];
        }
    }
}