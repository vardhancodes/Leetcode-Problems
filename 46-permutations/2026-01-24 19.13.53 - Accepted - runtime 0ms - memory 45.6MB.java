class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        recur(list,0,nums);
        return list;
    }
    public static void recur(List<List<Integer>> list, int ind , int[] nums )
    {
        if(ind == nums.length)
        {
            List<Integer> sublist = new ArrayList<>();
            for(int i = 0 ; i < nums.length ; i++)
            {
                sublist.add(nums[i]);
            }
            list.add(sublist);
        }

        for(int i = ind ; i < nums.length ; i++)
        {
            swap(nums,i,ind);
            recur(list,ind+1,nums);
            swap(nums,i,ind);
        }
    }

    public static void swap(int[] arr, int start , int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}