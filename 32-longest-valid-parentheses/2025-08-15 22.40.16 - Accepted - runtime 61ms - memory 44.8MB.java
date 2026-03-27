class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        removeValid(s , stack);

        if(stack.isEmpty())
        {
            return s.length();
        }
        ArrayList<Integer> list = new ArrayList<>();
        formArraylist(s,stack,list);
        
        int max = 0;
        for(int i = 1 ; i < list.size() ; i++)
        {
            int len = list.get(i) - list.get(i-1) -1;
            max = Math.max(max , len);
        }

        return max;
    }

    public void removeValid(String s , Stack<Integer> stack)
    {
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);

            if(ch == '(')
            {
                stack.push(i);
            }
            else
            {
                if(stack.isEmpty() || s.charAt(stack.peek()) == ')')
                {
                    stack.push(i);
                }
                else
                {
                    stack.pop();
                }
            }
        }
    }

    public void formArraylist(String s , Stack<Integer> stack, ArrayList<Integer> list)
    {
        list.add(0,s.length());
        while(!stack.isEmpty())
        {
            list.add(0,stack.pop());
        }
        list.add(0,-1);
    }
}