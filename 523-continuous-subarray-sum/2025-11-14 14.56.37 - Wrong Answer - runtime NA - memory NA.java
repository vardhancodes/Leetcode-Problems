class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,-1);
        for(int i = 0 ; i < nums.length ; i++)
        {
            sum+=nums[i];
            int rem = sum%k;
            if(rem < 0)
            {
                rem += k;
            }
            if(map.containsKey(rem))
            {
                int len = i-map.get(rem);
                if(len >= 2)
                {
                    return true;
                }
            }

            
            map.put(sum,i);

        }
        return false;
    }
}