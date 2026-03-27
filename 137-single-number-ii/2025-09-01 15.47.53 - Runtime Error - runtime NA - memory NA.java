class Solution {
    public int singleNumber(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(max < nums[i])
            {
                max = nums[i];
            }
        }
        int count[] = new int[max+1];
        for(int i = 0 ; i < nums.length ; i++)
        {
            count[nums[i]]++;
        }
        for(int i = 0 ; i < count.length ; i++)
        {
            if(count[i] == 1)
            {
                return i;
            }
        }
        return 0;
    }
}