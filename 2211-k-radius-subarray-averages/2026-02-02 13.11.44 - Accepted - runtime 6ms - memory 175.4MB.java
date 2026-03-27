class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] ans = new int[nums.length];
        int index = 0;
        long sum = 0;
        int n = nums.length;
        while(index < n && index <= k*2)
        {
            if(index < k)
            {
                ans[index] = -1;
            }
            sum += nums[index];
            index++;
        }
        int size = k*2+1;
        int start = 0;
        int pointer = k;
        for (int i = k; i <= n - k - 1; i++)
        {
            ans[i] = (int)(sum/size);
            
            if (i < n - k - 1) 
            {
                sum -= nums[start];
                start++;
                sum += nums[i + k + 1];
            }
            pointer++;
        }
        while(pointer < n)
        {
            ans[pointer] = -1;
            pointer++;
        }
        return ans;
    }

}
