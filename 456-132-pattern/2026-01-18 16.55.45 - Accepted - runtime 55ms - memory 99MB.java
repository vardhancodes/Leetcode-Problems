class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int secondmax = Integer.MIN_VALUE;
        for(int i = nums.length-1 ; i >= 0 ; i--)
        {
            if(nums[i] < secondmax)
            {
                return true;
            }
            while(!stack.isEmpty() && stack.peek() < nums[i])
            {
                secondmax = stack.pop();
                
            }
            stack.push(nums[i]);
            max = stack.peek();
            
        }

        return false;
    }
}