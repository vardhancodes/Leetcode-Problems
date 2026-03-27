class Solution {
    public int findPeakElement(int[] nums) {
        
        int start = 0 ;
        int size = nums.length;
        int end = size-1;
       
        while(start <= end)
        {
            int mid = (start+(end-start)/2);
            if (mid != 0 && mid !=size && nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1])
            {
                return mid;
            }
            else if (mid != size-1 && nums[mid] < nums[mid+1])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }

        return 0;
    }
}