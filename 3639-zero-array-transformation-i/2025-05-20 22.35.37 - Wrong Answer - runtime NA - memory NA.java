class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {

        for(int i = 0 ; i < queries.length ; i++)
        {
            for(int k = queries[i][0] ; k <= queries[i][1]  ; k++ )
            {
                nums[k] = nums[k] - 1;
            }
        }
        for( int i = 0 ; i < nums.length ; i++)
        {
            if(nums[0] != 0)
            {
                return false;
            }
        }
        return true;


    }
}