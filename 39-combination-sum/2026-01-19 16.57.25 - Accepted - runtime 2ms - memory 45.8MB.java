class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> sublist = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        recur(candidates,target,list,sublist,0);
        return list;
    }
    public static void recur(int[] candidates, int target , List<List<Integer>> list, List<Integer> sublist, int index )
    {
        if(target == 0)
        {
            list.add(new ArrayList<>(sublist));
            return;
        }

        if(target < 0)
        {
            return;
        }

        for(int i = index ; i < candidates.length ; i++)
        {
            if(target >= candidates[i])
            {
                sublist.add(candidates[i]);
                recur(candidates,target-candidates[i],list,sublist,i);
                sublist.remove(sublist.size()-1);
            }
        }

    }
}