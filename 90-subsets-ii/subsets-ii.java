class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> sublist = new ArrayList<Integer>();
        Arrays.sort(nums);
        recur(nums,0,sublist,list);
        return list;


    }

    public static void recur(int[]nums , int ind , List<Integer> sublist , List<List<Integer>> list)
    {
        list.add(new ArrayList<>(sublist));

        for(int i = ind ; i < nums.length ; i++)
        {
            if(i == ind || nums[i] != nums[i-1])
            {
                sublist.add(nums[i]);
                recur(nums,i+1,sublist,list);
                sublist.remove(sublist.size()-1);
            }
        }
    }
}