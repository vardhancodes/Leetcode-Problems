class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = -1;
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
        if(target == 0)
        {
            return 0;
        }
        if(ans == -1)
            {
                if(start == nums.length)
                {
                    if(target>nums[end])
                    {
                        return end+1;
                    }
                    else
                    {
                        return end;
                    }
                }
                else if(end == -1)
                {
                    if(target>nums[start])
                    {
                        return start+1;
                    }
                    else
                    {
                        return start;
                    }
                    
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