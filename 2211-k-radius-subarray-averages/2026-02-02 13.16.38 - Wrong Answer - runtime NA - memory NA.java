class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] ans = new int[nums.length];
        int index = 0;
        long sum = 0;
        int n = nums.length;
        while(index < n)
        {
            if(index < k)
            {
                ans[index] = -1;
            }
            if(index <= k*2)
            {
                sum += nums[index];
            }
            if(index < n && index >= k*2)
            {
                ans[index] = -1;
            }
            index++;
        }
        int size = k*2+1;
        int start = 0;
        for (int i = k; i <= n - k - 1; i++)
        {
            ans[i] = (int)(sum/size);
            
            if (i < n - k - 1) 
            {
                sum -= nums[start];
                start++;
                sum += nums[i + k + 1];
            }
        }
        return ans;
    }

}
