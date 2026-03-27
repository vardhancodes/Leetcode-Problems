class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        int count = 1;
        for(int i = 1 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch == s.charAt(i-1))
            {
                count++;
            }
            else
            {
                count = 1;
            }
            if(count < 3)
            {
                ans.append(ch);
            }
        }
        return ans.toString();
        
    }
}