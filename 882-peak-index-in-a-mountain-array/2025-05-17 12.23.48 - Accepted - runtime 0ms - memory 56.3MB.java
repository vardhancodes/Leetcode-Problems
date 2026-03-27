class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end)
        {
            int mid = (start + (end-start)/2);
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            {
                ans = mid;
                return ans;
            }
            else if(arr[mid] < arr[mid+1])
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