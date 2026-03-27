class Solution {
    public int maxSumDivThree(int[] nums) {
        int [] ans = new int[1];
        recur(0,nums,0,ans);
        return ans[0];

    }
    public static void recur(int ind , int [] nums , int sum , int ans[])
    {
        if(ind == nums.length)
        {
            if(sum%3 == 0)
            {
                ans[0] = Math.max(sum,ans[0]);
            }
            return ;
        }

        sum+=nums[ind];
        recur(ind+1,nums,sum,ans);
        sum-=nums[ind];
        recur(ind+1,nums,sum,ans);
    }
}