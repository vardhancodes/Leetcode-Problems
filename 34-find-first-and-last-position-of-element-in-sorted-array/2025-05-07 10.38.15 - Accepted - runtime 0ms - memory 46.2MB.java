class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];

        result[0] = binoccurence(nums , target , true);
        result[1] = binoccurence(nums , target , false);
        return result;
    }
    static int binoccurence(int arr[] , int target , boolean isfirst )
        {
            int ans = -1;
            int start = 0;
            int end = arr.length-1;
            while(start <= end)
            {
                int mid = (start + (end-start)/2);
                if(target == arr[mid])
                {
                    ans = mid;
                    if(isfirst)
                    {
                        end = mid-1;
                    }
                    else{
                        start = mid+1;
                    }

                    
                }
                else if(target > arr[mid])
                {
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
                
            }
            if(ans == -1)
            {
                return -1;
            }
            else
            {
                return ans;
            }

}
}