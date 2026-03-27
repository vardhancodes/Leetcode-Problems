class Solution {
    public int minimumK(int[] nums) {
        int start = 1;
        int ans = 0;
        while(start <= end)
        {
            int mid = start+(end-start)/2;
            if(isPossible(nums,mid))
            {
                ans = mid;
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] nums , int mid)
    {
        int counter = 0;
        long upper = (long)mid*mid;
        for(int i = 0 ; i < nums.length ; i++)
        {
            counter += (nums[i]%mid == 0)?(nums[i]/mid):(nums[i]/mid)+1;
            if(counter > upper)
            {
                return false;
            }
            
        }
        return true;
    }
}