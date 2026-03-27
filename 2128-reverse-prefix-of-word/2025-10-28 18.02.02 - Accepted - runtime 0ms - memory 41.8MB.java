class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder s1 = new StringBuilder(word);
        int pointer = 0;
        for(int i = 0 ; i < s1.length() ; i++)
        {
            if(ch == s1.charAt(i))
            {
                pointer = i;
                break;
            }
        }
        reverse(s1,pointer);
        return s1.toString();
    }
        
    public static StringBuilder reverse(StringBuilder s1 , int i)
    {
        int start = 0;
        int end = i;
        while(start < end)
        {
            char firstchar = s1.charAt(start);
            char lastchar = s1.charAt(end);
            s1.setCharAt(start,lastchar);
            s1.setCharAt(end,firstchar);
            start++;
            end--;
        }
        return s1;
    }
    
    
}