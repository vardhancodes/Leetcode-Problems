class Solution {
    public boolean check(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        int x = 0;
        int n = nums.length;
        int temp[] = new int[nums.length]; 
        for(int i = 0 ; i < n ; i++)
        {
            temp[i] = nums[i];
        }
        Arrays.sort(temp);
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(minVal > nums[i])
            {
                minVal = nums[i];
                x = i;
            }
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[(i+x)%temp.length] != temp[i])
            {
                return false;

            }

        }
        return true;



    }
}