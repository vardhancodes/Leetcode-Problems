class Solution {
    public int findMaxLength(int[] nums) {
        int ans  = 0;
        int len = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
            {
                if(map.getOrDefault(0,0) == map.getOrDefault(1))
                {
                    len = i-0+1;
                    ans = Math.max(len,ans);
                }
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        return ans;
    }
    
}