class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> sublist = new ArrayList<Integer>();
        recur(candidates,target,0,sublist,list);
        return list;

    }
    public static void recur(int[] arr , int target , int ind , List<Integer> sublist , List<List<Integer>> list)
    {
        int n = arr.length;
        if(ind == n)
        {
            if(target == 0)
            {
                list.add(new ArrayList<Integer>(sublist));
            }
            return;
        }

        if(arr[ind] <= target)
        {
            sublist.add(arr[ind]);
            recur(arr,target-arr[ind],ind,sublist,list);
            sublist.remove(sublist.size()-1);
        }

        recur(arr,target,ind+1,sublist,list);
    }
}