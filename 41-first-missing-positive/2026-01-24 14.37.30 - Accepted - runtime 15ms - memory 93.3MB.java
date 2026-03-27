class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int positivecount = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] > 0)
            {
                positivecount++;
            }
            if(nums[i] > max)
            {
                max = nums[i];
            }
            set.add(nums[i]);
        }
        for(int i = 1 ; i <= max ; i++)
        {
            if(!set.contains(i))
            {
                return i;
            }
        }
        return (positivecount > 0)? max+1 : 1;


        
    }
}