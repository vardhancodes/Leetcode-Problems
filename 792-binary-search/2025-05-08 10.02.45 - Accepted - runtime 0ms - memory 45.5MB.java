class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while(start <= end)
        {
            int mid = (start + (end-start)/2);
            if(target == nums[mid])
            {
                ans = mid;
                break;
            }
            else if(target > nums[mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }

        }
        return ans;
        
    }
}