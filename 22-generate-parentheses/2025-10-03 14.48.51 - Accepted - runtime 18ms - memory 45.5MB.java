class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        recur(n,list,"");
        return list;
    }
    public void recur(int n , List<String> list , String s )
    {
        if(s.length() == n*2)
        {
            if(isValid(s))
            {
                list.add(s);
            }
            return;
            
        }

        s = s + "(";
        recur(n,list,s);
        s=s.substring(0,s.length()-1);
        s=s+")";
        recur(n,list,s);
    }

    public static boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' )
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty() && ch == ')')
                {
                    return false;
                }
                else
                {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();

    }
}