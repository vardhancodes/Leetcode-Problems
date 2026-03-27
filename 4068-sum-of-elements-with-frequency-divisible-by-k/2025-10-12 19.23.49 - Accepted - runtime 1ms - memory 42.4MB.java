class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++)
            {
                if(nums[i]>max)
                {
                    max = nums[i];
                }
            }
        int freq[] = new int[max+1];
        for(int i = 0 ; i < nums.length ; i++)
            {
                freq[nums[i]]++;
            }
        for(int i = 0 ; i < freq.length ; i++)
            {
                if(freq[i] > 0 && freq[i]%k == 0)
                {
                    ans+=i*freq[i];
                }
            }
        return ans;
    }
}