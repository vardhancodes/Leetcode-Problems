class Solution {
    public int[] twoSum(int[] nums, int target) { 
        int []ans = new int[2]; 
        int inter = 0;
        for(int i =0 ; i<nums.length ; i++ )
        {
            inter = target - nums[i];
            int second = result(nums , inter, i);
            if(second != -1)
            {
                ans[0] = i;
                ans[1] = second;
                return ans;
            }
            
            

        }
        return nums;
        
        
    }

    static int result(int [] nums, int inter, int first)
    {
        int i = 0;

        for(i = 0 ; i<nums.length ; i++)
        {
            if(nums[i] == inter && i != first)            
            {
                
                return i;
                
            }
        }
        return -1;


    }
}