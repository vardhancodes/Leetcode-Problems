class Solution {
    public int smallestIndex(int[] nums) {
        int size = nums.length;

        for(int i = 0 ; i < size ; i++)
        {
            int sum = 0;
            while(nums[i] != 0)
            {
                int rem = nums[i]%10;
                sum = sum + rem;
                nums[i] = nums[i]/10;
                
            }

          
        
        
            if ( sum == i)
            { 
                return i;
            
            }
        }
        return -1;
        
    }
}