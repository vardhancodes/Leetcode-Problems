class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean vis[] = new boolean[nums.length];
        List<Integer>sublist = new ArrayList<>();
        recur(list,sublist,nums,vis);
        return list;
    }
    public static void recur(List<List<Integer>> list, List<Integer>sublist, int[] nums , boolean[] vis)
    {
        if(sublist.size() == nums.length)
        {
            list.add(new ArrayList<>(sublist));
            return;
        }

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(vis[i])
            {
                continue;
            }
            if(i > 0 && nums[i-1] == nums[i] && !vis[i-1])
            {
                continue;
            }
            vis[i] = true;
            sublist.add(nums[i]);
            recur(list,sublist,nums,vis);
            sublist.remove(sublist.size()-1);
            vis[i] = false;
        }
    }

   

    
}