class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        Arrays.sort(nums);
        recur(list,sublist,0,0,nums);
        return list;
    }
    public static void recur(List<List<Integer>> list, List<Integer> sublist, int index , int sum, int[] nums)
    {
        if(sublist.size() == 3)
        {
            if(sum == 0)
            {
                list.add(new ArrayList<>(sublist));
            }
            return;
        }
        if(sum > 0)
        {
            return;
        }

        for(int i = index ; i < nums.length ; i++)
        {
            if(i == index || nums[i] != nums[i-1])
            {
                sum += nums[i];
                sublist.add(nums[i]);
                recur(list,sublist,i+1,sum,nums);
                sum -= nums[i];
                sublist.remove(sublist.size()-1);
            }
        }
    }
}