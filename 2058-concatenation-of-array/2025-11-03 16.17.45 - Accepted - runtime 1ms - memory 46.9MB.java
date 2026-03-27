class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int arr[]=new int[2*n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            
        }
        int index=n;
        for(int i=0;i<n;i++){
                 arr[index]=nums[i];
                 index++;
        }
    return arr;
    }
}