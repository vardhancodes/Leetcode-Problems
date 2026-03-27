class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    recur(nums,list,0);
    return list;
    }

    public static void recur(int[] nums , List<List<Integer>> list , int ind)
    {
        int n = nums.length;
        List<Integer> sublist = new ArrayList<Integer>(); 
        if(ind == n-1)
        {
            for(int i = 0 ; i < n ; i++)
            {
                sublist.add(nums[i]);
            }
            list.add(new ArrayList<Integer>(sublist));
            return;
        }

        for(int i = ind ; i < n ; i++)
        {
            swap(nums,ind,i);
            recur(nums,list,ind+1);
            swap(nums,ind,i);
        }
    }

    public static void swap(int []nums , int ind , int i)
    {
        int temp = nums[ind];
        nums[ind] = nums[i];
        nums[i] = temp;
    }
}