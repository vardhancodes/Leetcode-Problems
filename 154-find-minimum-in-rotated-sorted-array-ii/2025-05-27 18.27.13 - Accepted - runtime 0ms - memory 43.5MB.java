class Solution {
    public int findMin(int[] nums) {

        int start = 0 ; 
        int size = nums.length;
        int end = size-1;
        int min = Integer.MAX_VALUE;

        if(size == 1)
        {
            return nums[0];
        }

        while(start <= end)
        {
            int mid = (start + (end-start)/2);
            if(nums[start] == nums[mid] && nums[mid] == nums[end])
            {
                min = Math.min(nums[start],min);
                start++;
                end--;
            }
            else if(nums[start] <= nums[mid])
            {
                min = Math.min(nums[start],min);
                start = mid+1;
            }
            else
            {
                min = Math.min(nums[mid] , min);
                end = mid-1;
            }

        }

        return min;
        
    }
}