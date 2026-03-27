class Solution {
    public int myAtoi(String s) {
       boolean positive = true;
       boolean foundadigit = false;
       boolean signencountered = false;
       long res = 0;
       for(int i = 0 ; i < s.length() ; i++)
       {
            if((s.charAt(i) == ' ') &&  (!foundadigit) &&(!signencountered))
            {
                continue;
            }
            else if((s.charAt(i) == '-' || s.charAt(i) == '+') && (!foundadigit) && (!signencountered))
            {
                signencountered = true;
                positive = (s.charAt(i) == '-')?false:true;
            }
            else if(!(Character.isDigit(s.charAt(i))))
            {
                break;
            }
            else 
            {
                foundadigit = true;
                int digit = s.charAt(i) - '0';
                if (res > (Integer.MAX_VALUE - digit) / 10) {
                    return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                res = res*10+(s.charAt(i) - '0');

            }
       }



       if(!positive)
       {
            res =  res*-1;
       }

       if(res > Integer.MAX_VALUE)
       {
            return Integer.MAX_VALUE;
       }
       if(res < Integer.MIN_VALUE)
       {
            return Integer.MIN_VALUE;
       }


       return (int)res;
       

    }
}