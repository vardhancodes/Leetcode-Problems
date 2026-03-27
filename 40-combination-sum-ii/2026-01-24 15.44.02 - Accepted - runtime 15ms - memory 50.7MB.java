class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        Arrays.sort(candidates);
        recur(list, sublist , candidates , 0 , target);
        return list;
    }

    public static void recur(List<List<Integer>> list, List<Integer> sublist, int []arr , int index , int target)
    {
        if(target == 0)
        {
            list.add(new ArrayList<>(sublist));
            return;
        }

        if(index == arr.length)
        {
            return;
        }

        for(int i = index ; i < arr.length ; i++)
        {
            if(i == index || arr[i] != arr[i-1] && arr[i] <= target)
            {
                sublist.add(arr[i]);
                recur(list,sublist,arr,i+1,target-arr[i]);
                sublist.remove(sublist.size()-1);
            }
        }


    }
}