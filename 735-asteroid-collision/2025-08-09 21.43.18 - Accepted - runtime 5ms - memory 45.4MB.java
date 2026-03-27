class Solution {
    public int[] asteroidCollision(int[] asteroids) {

    Stack<Integer> stack = new Stack<>();

    for(int i = 0 ; i < asteroids.length ; i++)
    {
        if(stack.isEmpty() || asteroids[i] > 0)
        {
            stack.push(asteroids[i]);

        }
        else{

            while(!stack.isEmpty())
            {
                int top = stack.peek();
                if(top < 0)
                {
                    stack.push(asteroids[i]);
                    break;
                }
                int modVal = Math.abs(asteroids[i]);
                if(top > modVal)
                {
                    break;
                }
                else if (top == modVal)
                {
                    stack.pop();
                    break;
                }
                else 
                {
                    stack.pop();
                    if(stack.isEmpty())
                    {
                        stack.push(asteroids[i]);
                        break;
                    }
                }

                    
                


            }
        }
    }

    int ans[] = new int[stack.size()];
    int len = stack.size();

    for(int i = len-1 ; i>= 0 ; i-- )
    {
        ans[i] = stack.pop();
    }

    return ans;


}
}