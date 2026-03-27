class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist  =  new ArrayList<>();
        recur(list,sublist,nums);
        return list;
    }
    public static void recur(List<List<Integer>> list, List<Integer> sublist, int[] nums )
    {
        if(sublist.size() == nums.length)
        {
            list.add(new ArrayList<>(sublist));
            return;
        }

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(!sublist.contains(nums[i]))
            {
                sublist.add(nums[i]);
                recur(list,sublist,nums);
                sublist.remove(sublist.size()-1);
            }
        }        
    }

    
}