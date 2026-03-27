class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int index = 0;
        int n = nums.length;
        while(index< n && nums[index]!= 0)
            {
                index++;
            }
        int prev = index;
        for(int i = index+1;i<n ; i++)
            {
                if(nums[i] == 1)
                {
                    if((i-prev-1) < k)
                    {
                        return false;
                    }
                }
            }
        return true;
    }
}