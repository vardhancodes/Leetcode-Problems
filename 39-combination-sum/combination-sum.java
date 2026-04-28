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
        
        if(ind == candidates.length)
        {
            return;
        }

        if(candidates[ind] <= target)
        {
            sublist.add(candidates[ind]);
            recur(candidates,list,sublist,ind,target-candidates[ind]);
            sublist.remove(sublist.size()-1);
        }

        recur(candidates,list,sublist,ind+1,target);

    }
}