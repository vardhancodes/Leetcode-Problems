class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch == '[')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty() || stack.peek() == ']')
                {
                    stack.push(ch);
                }
                else
                {
                    stack.pop();
                }
            }
        }
        int ans = 0;
        while(!stack.isEmpty())
        {
            char top = stack.pop();
            if(top == '[')
            {
                ans++;
            }
            
        }

        return (ans%2==0)?(ans/2):(ans/2 +1);
    }
}