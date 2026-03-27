class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        int k = 1;
        int start = 1;

        for(int i = 1 ; i <size; i++)
        {
            if(nums[i] != nums[i-1])
            {
                k++;
                nums[start] = nums[i];
                start++;


            }


        }
        return k;
    }
}