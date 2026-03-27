class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            int secondVal = target-nums[i];
            if(map.containsKey(secondVal))
            {
                ans[0] = i;
                ans[1] = map.get(secondVal);
                return ans;
            }
            map.put(nums[i],i);

        }
        return ans;

        
        
    }

   
}