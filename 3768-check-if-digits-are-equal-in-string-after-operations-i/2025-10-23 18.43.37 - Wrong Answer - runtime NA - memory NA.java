class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder s1 = new StringBuilder(s); 
        if(s.length() < 2)
        {
            return true;
        }
        if(s.length() == 2)
        {
            if(s.charAt(0) == s.charAt(1))
            {
                return true;
            }
            return false;
        }
        while(s1.length()>2)
        {
            StringBuilder str = new StringBuilder();
            int ptr1 = 0;
            int ptr2 = 1;
            while(ptr2 < s1.length())
            {
                int digit1 = s1.charAt(ptr1) -'0';
                int digit2 = s1.charAt(ptr2) - '0';
                int result = (digit1+digit2)%10;
                str.append(result);
                ptr1++;
                ptr2++;
            }
            
            for(int i = 0 ; i < str.length()-1 ; i++)
            {
                if(str.charAt(i) != str.charAt(i+1))
                {
                    break;
                }
                return true;
            }
            s1 = str;
        }
        return false;

    }

}