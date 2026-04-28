class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> sublist = new ArrayList<Integer>();
        recur(nums,0,list,sublist);
        return list;

    }
    public static void recur(int[] nums , int ind ,List<List<Integer>> list,List<Integer> sublist)
    {
        
        list.add(new ArrayList<>(sublist));  
        

        for(int i = ind ; i < nums.length ; i++)
        {
            sublist.add(nums[i]);
            recur(nums,i+1,list,sublist);
            sublist.remove(sublist.size()-1);
        }

        
    }
}