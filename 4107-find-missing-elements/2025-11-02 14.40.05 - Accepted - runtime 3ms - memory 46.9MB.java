class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i]>max)
            {
                max = nums[i];
            }
            if(min > nums[i])
            {
                min = nums[i];
            }
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = min+1 ; i < max ; i++)
        {
            if(!map.containsKey(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}