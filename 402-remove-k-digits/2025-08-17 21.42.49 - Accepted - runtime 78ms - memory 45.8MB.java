class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < num.length() ; i++)
        {
            char ch = num.charAt(i);
            while(!stack.isEmpty() && k>0 && ch<stack.peek())
            {
                stack.pop();
                k--;   
            }
            stack.push(ch);
        }
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty())
        {
            if(k>0)
            {
                stack.pop();
                k--;
            }
            else
            {
                str.insert(0,stack.pop());
            }
        }
        while(str.length()!=0 && str.charAt(0) == '0')
        {
            str.deleteCharAt(0);
        }
        return (str.length()==0)?"0":str.toString();
    }
}