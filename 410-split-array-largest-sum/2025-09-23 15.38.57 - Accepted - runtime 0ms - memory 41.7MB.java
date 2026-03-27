class Solution {
    static boolean isbookallocation(int maxpages , int students , int[] arr)
    {
        int currentstudent = 1;
        int pages = 0 ;
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            pages+=arr[i];
            if(pages > maxpages)
            {
                currentstudent++;
                pages = arr[i];
            }
            if(currentstudent > students)
            {
                return false;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int res = -1;
        if(nums.length < k)
        {
            return res;
        }
        int start = Integer.MIN_VALUE;
        int end = 0;
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] > start)
            {
                start = nums[i];
            }
            end += nums[i];
        }
        
        while(start <= end)
        {
            int mid = (start+(end-start)/2);
            if(isbookallocation( mid, k, nums))
            {
                res = mid;
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
            
        }
        return res;
    }
}