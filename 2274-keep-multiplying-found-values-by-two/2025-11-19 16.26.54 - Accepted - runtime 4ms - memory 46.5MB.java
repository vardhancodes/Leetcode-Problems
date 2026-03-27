class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        int num = original;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(set.contains(num))
            {
                num=num*2;
            }
            else{
                break;
            }
        }
        return num;
    }
}