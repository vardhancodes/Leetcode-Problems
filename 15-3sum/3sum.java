class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<List<Integer>> ans = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            HashSet<Integer> set = new HashSet<>();
            for(int j = i+1 ; j < nums.length ; j++)
            {
                if(set.contains(-(nums[i] + nums[j])))
                {
                    List<Integer> sublist = new ArrayList<>();
                    sublist.add(nums[i]);
                    sublist.add(nums[j]);
                    sublist.add(-(nums[i]+nums[j]));
                    Collections.sort(sublist);
                    if(!ans.contains(sublist))
                    {
                        list.add(sublist);
                        ans.add(sublist);
                    }
                }
                set.add(nums[j]);
                
            }
        }

        return list;
    }
}