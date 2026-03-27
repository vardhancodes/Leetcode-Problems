class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++)
            {
                for(int j = i ; j < nums.length ; j++)
                    {
                        if(isFibonacci(nums,i,j))
                        {
                            ans = Math.max(ans,j-i+1);
                        }

                    }
            }
        return ans;
    }

    public static boolean isFibonacci(int[] nums , int i , int j)
    {
        if(nums.length == 1 || nums.length == 2)
        {
            return true;
        }
        
        for(int k = j ; k >=i+2 ; k--)
            {
                if(nums[k] != nums[k-1] + nums[k-2])  
                {
                    return false;
                }
            }
        return true;
    }
}