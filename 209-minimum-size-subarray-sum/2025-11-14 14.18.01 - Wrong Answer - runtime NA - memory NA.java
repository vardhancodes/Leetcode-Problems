class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        map.put(0,-1);
        for(int i = 0 ; i < nums.length ; i++)
        {
            sum += nums[i];
            int rem = sum-target;
            if(map.containsKey(rem))
            {
                int len = i-(map.get(rem));
                min = Math.min(min,len);
            }
            map.put(sum,i); 
        }
        return (min==Integer.MAX_VALUE)?0:min;
    }
}