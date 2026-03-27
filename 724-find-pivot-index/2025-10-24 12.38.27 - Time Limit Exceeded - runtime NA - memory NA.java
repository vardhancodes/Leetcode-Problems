class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int leftsum = 0;
        int rightsum = 0;
        int ans = 0;
        while(left<=right)
        {
            if(leftsum > rightsum)
            {
                rightsum+=nums[right];
                right--;
            }
            else if(leftsum < rightsum)
            {
                leftsum+= nums[left];
                left++;
            }
            else
            {
                ans = left;
            }
        }
        return ans;

    }
}