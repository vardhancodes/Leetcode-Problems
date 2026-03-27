class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int lcount = 0;
        int pcount = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] < pivot)
            {
                lcount++;
            }
            if(nums[i] == pivot)
            {
                pcount++;
            }
        }

        int []res = new int[nums.length];
        int counter = 0;
        int i = 0;
        int j = lcount;
        int p = lcount+pcount;
        while(counter < nums.length)
        {
            if(nums[counter] < pivot)
            {
                res[i] = nums[counter];
                i++;
            }
            else if(nums[counter] == pivot)
            {
                res[j] = nums[counter];
                j++;
            }
            else
            {
                res[p] = nums[counter];
                p++;
            }
            counter++;
        }
        return res;
    }

}