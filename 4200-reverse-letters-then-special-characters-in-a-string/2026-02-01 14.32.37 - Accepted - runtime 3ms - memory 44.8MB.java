class Solution {
    public String reverseByType(String s) {
        int start = 0;
        int end = s.length()-1;
        StringBuilder ans = new StringBuilder(s);
        while(start < end)
        {
            if(Character.isLetter(ans.charAt(start)) && Character.isLetter(ans.charAt(end)))
            {
                char ch = ans.charAt(start);
                ans.setCharAt(start,ans.charAt(end));
                ans.setCharAt(end,ch);
                start++;
                end--;
            }
            else if(Character.isLetter(ans.charAt(start)) && !Character.isLetter(ans.charAt(end)))
            {
                end--;
            }
            else if(!Character.isLetter(ans.charAt(start)) && Character.isLetter(ans.charAt(end)))
            {
                start++;
            }
            else
            {
                start++;
                end--;
            }
           
        }
        start = 0;
        end = ans.length()-1;
        while(start < end)
        {   
            if(!Character.isLetter(ans.charAt(start)) && !Character.isLetter(ans.charAt(end)))
            {
                char ch = ans.charAt(start);
                ans.setCharAt(start,ans.charAt(end));
                ans.setCharAt(end,ch);
                start++;
                end--;
            }
            else if(!Character.isLetter(ans.charAt(start)) && Character.isLetter(ans.charAt(end)))
            {
                end--;
            }
            else if(Character.isLetter(ans.charAt(start)) && !Character.isLetter(ans.charAt(end)))
            {
                start++;
            }
            else
            {
                start++;
                end--;
            }
           
        }

        return ans.toString();


    }
}