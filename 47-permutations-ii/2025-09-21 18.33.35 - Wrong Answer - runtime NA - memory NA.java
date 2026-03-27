class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        recur(nums,0,list);
        return list;
    }

    public static void recur(int[]nums , int ind, List<List<Integer>> list)
    {
        List<Integer> sublist = new ArrayList<Integer>();
        int n = nums.length;
        if(ind == n)
        {
            for(int i = 0 ; i < n ; i++)
            {
                sublist.add(nums[i]);
            }
            list.add(new ArrayList<>(sublist));
            return;
        }
        for(int i = ind ; i<n; i++)
        {
            if(i != ind && nums[ind] == nums[i])
            {
                continue;
            }

            swap(i,ind,nums);
            recur(nums,ind+1,list);
            swap(i,ind,nums);
        }
    }

    public static void swap(int i , int ind , int nums[])
    {
        int temp = nums[i];
        nums[i] = nums[ind];
        nums[ind] = temp;
    }
}