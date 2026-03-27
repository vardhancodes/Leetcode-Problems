class Solution {
    public int myAtoi(String s) {
       boolean positive = true;
       boolean foundadigit = false;
       int res = 0;
       for(int i = 0 ; i < s.length() ; i++)
       {
            if(s.charAt(i) == ' ')
            {
                continue;
            }
            else if((s.charAt(i) == '-' || s.charAt(i) == '+') && (!foundadigit))
            {
                positive = (s.charAt(i) == '-')?false:true;
            }
            else if(!(Character.isDigit(s.charAt(i))))
            {
                break;
            }
            else 
            {
                foundadigit = true;
                res = res*10+(s.charAt(i) - '0');
            }
       }

       if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE)
       {
            res = (res > Integer.MAX_VALUE)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            return res;
       }

       if(!positive)
       {
            return res*-1;
       }

       return res;
       

    }
}