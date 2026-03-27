class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        int start = 0;
        int end = nums.length-1;

        while(start <= end)
        {
            int mid = (start+(end-start)/2);
            if(target  == nums[mid])
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
        if(ans == 0)
            {
                if(start == nums.length)
                {
                    return end+1;
                }
                else if(end == -1)
                {
                    return start-1;
                }
                else{

                    return end+1;
                }

                
            }
        else{

            return ans;
        }

    

        
    }
}