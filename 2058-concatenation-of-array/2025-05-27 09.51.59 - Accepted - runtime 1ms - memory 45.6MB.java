class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int newsize = nums.length*2;

        int []ans = new int[newsize];


        for(int i =0; i < size ; i++)
        {
            ans[i] = nums[i];
            ans[i + size] = nums[i]; 
        }
        
        return ans;

    


    }
}