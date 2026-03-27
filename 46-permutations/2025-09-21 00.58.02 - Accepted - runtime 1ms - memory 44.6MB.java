class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        recur(nums,0,list);
        return list;

    }
    public static void recur(int[]nums , int ind ,List<List<Integer>> list )
    {
        int n = nums.length;
        if(ind==n-1)
        {
            List<Integer> sublist = new ArrayList<Integer>();
            for(int i = 0 ; i < nums.length ; i++)
            {
                sublist.add(nums[i]);
            }
            list.add(new ArrayList<>(sublist));
            return;
        }

        for(int i = ind ; i < n ; i++)
        {
            swap(ind,i,nums);
            recur(nums,ind+1,list);
            swap(ind,i,nums);
        }
    }

    public static void swap(int ind , int i , int[] nums)
    {
        int temp = nums[ind];
        nums[ind] = nums[i];
        nums[i] = temp;
    }
}