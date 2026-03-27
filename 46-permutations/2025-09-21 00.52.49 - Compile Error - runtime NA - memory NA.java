class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

    }
    public static void recur(int[]nums , int ind ,List<List<Integer>> list )
    {
        int n = nums.length;
        if(ind==n)
        {
            List<Integer> sublist = new ArrayList<Integer>();
            for(int i = 0 ; i < nums.length ; i++)
            {
                sublist.add(nums[i]);
            }
            list.add(new ArrayList<Integer>(sublist));
            return;
        }

        for(int i = 0 ; i < n ; i++)
        {
            swap(ind,i,nums);
            recur(nums,ind+1,list);
            swap(ind,i,nums);
        }
    }

    public static void swap(int ind , int i , int[] nums)
    {
        int temp = nums[ind];
        nums[ind] = i;
        nums[i] = temp;
    }
}