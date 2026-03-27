class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        recur(candidates,list,sublist,0,target);
        return list;
    }

    public static void recur(int[] candidates, List<List<Integer>> list, List<Integer> sublist, int index , int target)
    {
        if(target == 0)
        {
            list.add(new ArrayList<>(sublist));
            return;
        }

        if(index == candidates.length)
        {
            return;
        }

        for(int i = index ; i < candidates.length ; i++)
        {
            if(candidates[i] <= target)
            {
                sublist.add(candidates[i]);
                recur(candidates,list,sublist,i,target-candidates[i]);
                sublist.remove(sublist.size()-1);
            }
        }
    }
}