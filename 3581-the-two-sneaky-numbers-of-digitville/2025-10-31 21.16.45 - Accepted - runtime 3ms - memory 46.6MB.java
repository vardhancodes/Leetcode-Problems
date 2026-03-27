class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int []ans = new int[2];
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 2)
            {
                ans[index] = entry.getKey();
                index++;
            }
        }
        return ans;
    }
}