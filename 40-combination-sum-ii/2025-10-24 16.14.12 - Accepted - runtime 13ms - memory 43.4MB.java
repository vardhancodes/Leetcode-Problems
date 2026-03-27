class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> sublist = new ArrayList<Integer>();
        Arrays.sort(candidates);
        recur(candidates,target,0,list,sublist);
        return list;

    }

    public static void recur (int[] arr , int target , int ind , List<List<Integer>> list , List<Integer> sublist)
    {
        if(target == 0)
        {
            list.add(new ArrayList<Integer>(sublist));
            return;
                        
        }


        for(int i = ind ; i < arr.length ; i++)
        {
            if((i == ind) || (arr[i] != arr[i-1] && arr[i] <= target ))
            {
                sublist.add(arr[i]);
                recur(arr,target-arr[i],i+1,list,sublist);
                sublist.remove(sublist.size()-1);
            }
        }
        
       
    }
}