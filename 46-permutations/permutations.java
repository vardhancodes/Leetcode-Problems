class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        recur(list,nums,0);
        return list;
    }
    public static void recur(List<List<Integer>> list, int[] nums , int ind )
    {
       if(ind == nums.length)
       {    List<Integer> sublist = new ArrayList<>();
            for(int i = 0 ; i < nums.length ; i++)
            {
                sublist.add(nums[i]);
            }
            list.add(sublist);

            return;
       }

       for(int i = ind ; i < nums.length ; i++)
       {
            swap(nums,i,ind);
            recur(list,nums,ind+1);
            swap(nums,i,ind);
       }
    }

    public static void swap(int[] nums, int start , int end)
    {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    
}