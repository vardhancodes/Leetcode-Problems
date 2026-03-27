class Solution {
    public int maxDepth(String s) {
       Stack<Character> stack = new Stack<>();
       int ans = 0;
       int count = 0;
       for(int i = 0 ; i < s.length() ; i++)
       {
            if(s.charAt(i) == '(')
            {
                count++;
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')')
            {
                count--;
                stack.pop();
            }
            ans = Math.max(ans,count);
       }
       return ans;
    }
}