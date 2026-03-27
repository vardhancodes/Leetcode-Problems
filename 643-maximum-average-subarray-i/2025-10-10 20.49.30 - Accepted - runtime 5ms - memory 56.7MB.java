class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int index = 0;
        int sum = 0;

        while(index < k && index < n)
        {
            sum += nums[index];
            index++;
        }
        double maxSum = (double)sum;

        for(int i = 1 ; i <= n-k ; i++)
        {
            sum = sum - nums[i-1] + nums[i+k-1];
            maxSum = Math.max(sum,maxSum);
        }

        return maxSum/k;
        
    }
}