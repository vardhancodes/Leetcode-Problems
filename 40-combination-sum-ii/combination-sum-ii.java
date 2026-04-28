class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        Arrays.sort(candidates);
        recur(list, sublist , candidates , 0 , target);
        return list;
    }

    public static void recur(List<List<Integer>> list, List<Integer> sublist, int []arr , int ind , int target)
    {
        if(target == 0)
        {
            list.add(new ArrayList<>(sublist));
            return;
        }

        for(int i = ind ; i < arr.length ; i++)
        {
            if(arr[i] <= target && (i == ind || arr[i] != arr[i-1]))
            {
                sublist.add(arr[i]);
                recur(list,sublist,arr,i+1,target-arr[i]);
                sublist.remove(sublist.size()-1);
            }
        }
    }
}