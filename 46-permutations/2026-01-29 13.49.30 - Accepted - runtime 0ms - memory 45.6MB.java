class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();
       recur(list,0,nums);
       return list;
    }
    public static void recur(List<List<Integer>> list, int index,int[] nums)
    {
        if(index == nums.length-1)
        {
            List<Integer> sublist = new ArrayList<>();
            for(int i = 0 ; i < nums.length ; i++)
            {
                sublist.add(nums[i]);
            }
            list.add(sublist);
        }

        for(int i = index ; i < nums.length ; i++)
        {
            swap(nums,index,i);
            recur(list,index+1,nums);
            swap(nums,index,i);
        }
    }
    public static void swap(int[] nums , int i , int index)
    {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}