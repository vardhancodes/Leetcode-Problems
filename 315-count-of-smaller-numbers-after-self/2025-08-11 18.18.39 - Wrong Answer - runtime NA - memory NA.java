class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = nums.length-1 ; i>= 0 ; i--)
        {
            while(!stack.isEmpty() && nums[i]<=stack.peek())
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                list.add(0);
            }
            else
            {
                list.add(stack.peek());
            }
            stack.push(nums[i]);
        }

        Collections.reverse(list);

        return list;
        
    }
}