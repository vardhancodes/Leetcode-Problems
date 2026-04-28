class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> sublist = new ArrayList<Integer>();
        int []arr = {1,2,3,4,5,6,7,8,9};
        recur(arr,k,n,list,sublist,0);
        return list;
    }
    public static void recur(int[] arr, int k, int target,List<List<Integer>> list ,List<Integer> sublist , int ind)
    {
        if(target < 0) return;
        if(k == 0)
        {
            if(target == 0)
            {
                list.add(new ArrayList<>(sublist));
                
            }
            return;
        }
        

        for(int i = ind ; i < arr.length ; i++)
        {
            if(arr[i] <= target)
            {
                sublist.add(arr[i]);
                recur(arr,k-1,target-arr[i],list,sublist,i+1);
                sublist.remove(sublist.size()-1);
            }
        }
    }
}