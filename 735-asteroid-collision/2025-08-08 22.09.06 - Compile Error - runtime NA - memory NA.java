class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i , asteroids.length ; i++)
        {
            int as = asteroids[i];

            if(as >= 0)
            {
                stack.push(as);
            }
            else
            {
                if(!stack.isEmpty() || stack.peek()<=0)
                {
                    stack.push(as);
                }
                else
                {
                    
                }
            }
        }
        
    }
}