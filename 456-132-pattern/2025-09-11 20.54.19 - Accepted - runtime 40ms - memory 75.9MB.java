class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int secondMax = Integer.MIN_VALUE;
        if(n < 3)
        {
            return false;
        }
        Stack<Integer>stack = new Stack<>();
        for(int i = n-1 ; i>= 0 ; i--)
        {
            if(nums[i] < secondMax)
            {
                return true;
            }
            while(!stack.isEmpty() && stack.peek()<nums[i])
            {
                secondMax = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}