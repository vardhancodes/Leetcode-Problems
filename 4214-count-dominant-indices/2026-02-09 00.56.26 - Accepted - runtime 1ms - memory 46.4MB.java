class Solution {
    public int dominantIndices(int[] nums) {
        int totalsum = 0;
        int no = 0;
        int ans = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            totalsum += nums[i];
            no++;
        }

        for(int i = 0 ; i < nums.length ; i++)
        {
            totalsum -= nums[i];
            no--;
            if(no == 0)
            {
                break;
            }
            if(nums[i] > totalsum/no)
            {
                ans++;
            } 
        }

        return ans;

    }
}