class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        recur(candidates,list,sublist,0,target);
        return list;
    }

    public static void recur(int[] candidates, List<List<Integer>> list, List<Integer> sublist, int ind , int target)
    {
        if(target == 0)
        {
            list.add(new ArrayList<>(sublist));
            return;
        }

        for(int i = ind ; i < candidates.length ; i++)
        {
            if(candidates[i] <= target && (i == ind || candidates[i] != candidates[i-1]))
            {
                sublist.add(candidates[i]);
                recur(candidates,list,sublist,i,target-candidates[i]);
                sublist.remove(sublist.size()-1);
            }
            
        }
    }
}