class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);

        for(int i = 0 ; i < nums.length ; i++)
            {
                if(nums[i] == k)
                {
                    count++;
                }
                sum+=nums[i];
                if(set.contains(sum-k))
                {
                    count++;
                }
                set.add(nums[i]);
            }
        return count;
    }
}