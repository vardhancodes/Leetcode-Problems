class Solution {
    public boolean check(int[] nums) {
        int[] temp = nums.clone();
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int k = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(min > nums[i])
            {
                min = nums[i];
                k = i;
            }
        }

        rev(nums,k,n-1);
        rev(nums,0,k-1);
        rev(nums,0,n-1);

        for(int i = 1 ; i < nums.length ; i++)
        {
            if(nums[i] < nums[i-1])
            {
                return false;
            }

        }
        return true;
    }

    public static void rev (int []nums, int start , int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}