class Solution {
    public int removeElement(int[] nums, int val) { 
        int start =0;
        int count = 0;
        int size = nums.length;
        
        for(int i = 0 ; i < size ; i++)
        {
            if(nums[i] == val)
            {
                count++;

            }
            if(nums[i] != val)
            {
                nums[start] = nums[i];
                ;
                start++;

            }


        }
        return size-count;
        
        
    }
}