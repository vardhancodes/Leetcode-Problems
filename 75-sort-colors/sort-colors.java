class Solution {
    public void sortColors(int[] nums) {
        //0---low-1 = already sorted extreme left 
        //low---mid-1 = already sorted 
        //mid---high = unsorted part
        //high+1---n-1 = already sorted extreme right

        int mid = 0;
        int high = nums.length-1;
        int low = 0;

        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                swap(nums,mid,low);
                mid++;
                low++;
            }

            else if(nums[mid] == 1)
            {
                mid++;
            }

            else
            {
                swap(nums,mid,high);
                high--;
            }
        }

    }

    static void swap(int[] nums, int start, int end)
    {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}