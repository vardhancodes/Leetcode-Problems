class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> sublist = new ArrayList<Integer>();
        Arrays.sort(nums);
        recur(0,list,sublist,nums,(long)target);
        return list;

    }
    public void recur(int ind , List<List<Integer>> list , List<Integer> sublist, int[] nums, long target)
    {
        int n = nums.length;
        if(sublist.size() == 4)
        {
            if(target == 0)
            {
                list.add(new ArrayList<Integer>(sublist));
            }
            return;

        }

        for(int i = ind ; i < n; i++)
        {
            if((i == ind || nums[i] != nums[i-1]))
            {
                sublist.add(nums[i]);
            recur(i+1,list,sublist,nums,target-nums[i]);
            sublist.remove(sublist.size()-1);

            }
           
            
        }
    }
}