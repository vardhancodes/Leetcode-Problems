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
        double maxAvg = (double)sum/k;

        for(int i = 1 ; i <= n-k ; i++)
        {
            sum = sum - nums[i-1] + nums[i+k-1];
            double avg = (double)sum/k;
            maxAvg = Math.max(avg,maxAvg);
        }

        return maxAvg;
        
    }
}