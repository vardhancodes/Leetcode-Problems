class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        int start = 0 ; 
        int end = n;
        int ind = 0;
        while(end < nums.length)
        {
            ans[ind] = nums[start];
            start++;
            ind++;
            ans[ind] = nums[end];
            end++;
            ind++;

        }

        return ans;
    }
}