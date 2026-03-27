class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        Arrays.sort(nums);
        boolean arr[] = new boolean[nums.length];
        recur(list,sublist,arr,nums);
        return list;
    }

    public static void recur(List<List<Integer>> list ,List<Integer> sublist,boolean []arr, int[] nums)
    {
        if(sublist.size() == nums.length)
        {
            list.add(new ArrayList<>(sublist));
            return;
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(arr[i]) 
            {
                continue;
            }

            if(i > 0 && nums[i] == nums[i-1] && !arr[i-1])
            {
                continue;
            }
            sublist.add(nums[i]);
            arr[i] = true;
            recur(list,sublist,arr,nums);
            sublist.remove(sublist.size()-1);
            arr[i] = false;
            
            
        }
    }
    
}