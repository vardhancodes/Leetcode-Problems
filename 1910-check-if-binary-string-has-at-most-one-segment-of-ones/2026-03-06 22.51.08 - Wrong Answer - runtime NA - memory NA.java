class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length() == 1)
        {
            return (s.charAt(0) == 0)?false:true;
        }
        for(int i = 0 ; i < s.length()-1 ; i++)
        {
            if((s.charAt(i) == '1') && (s.charAt(i+1) == '1'))
            {
                return true;
            }
        }

        return false;


    }
}