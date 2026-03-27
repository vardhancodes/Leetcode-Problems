class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        recur(n,list,"");
        return list;
    }
    public static void recur(int n , List<String> list , String ans)
    {
        if(ans.length() == n*2)
        {
            if(isValid(ans))
            {
                list.add(ans);   
            }
            return;
        }
        
        recur(n,list,ans+"(");
        recur(n,list,ans+")");
    }

    public static boolean isValid(String ans)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < ans.length() ; i++)
        {
            char ch = ans.charAt(i);
            if(ch == '(')
            {
                stack.push(ch);
            }
            else
            {
                if(ch == ')' && stack.isEmpty())
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