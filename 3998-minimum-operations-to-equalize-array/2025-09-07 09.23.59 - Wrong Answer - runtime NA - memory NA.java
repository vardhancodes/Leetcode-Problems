class Solution {
    public int minOperations(int[] nums){
        int target = nums[0];
        boolean equal = true;
        for(int i = 1 ; i < nums.length ; i++)
            {
                if(nums[i] != nums[0])
                {
                    equal = false;
                    break;
                }
            }
        if(equal)
        {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            target &= nums[i];
        }

        int count = 0;
        int curr = ~0; 
        for (int i = 0; i < nums.length; i++) {
            curr &= nums[i];
            if (curr == target) {
                count++;
                curr = ~0;
            }
        }
        return count;
    }
}