class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = 0;
        int n = nums.length;
        int sum  = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0 ; i < nums.length ; i++)
        {
            sum += nums[i];
            int rem = goal - sum;
            if(map.containsKey(rem))
            {
                ans += map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}