class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<String>();
        recur(n,"",list);
        return list;
    }
    public void recur(int n , String s ,List<String> list )
    {
        if(s.length() == n)
        {
            if(isValid(s))
            {
                list.add(s);

            }
            return;
        }

        s=s+"0";
        recur(n,s,list);
        s=s.substring(0,s.length()-1);
        s=s+"1";
        recur(n,s,list);
    }

    public boolean isValid(String s)
    {
        for(int i = 0 ; i < s.length()-1 ; i++)
        {
            if(s.charAt(i)=='0' && s.charAt(i+1) == '0')
            {
                return false;
            }
        }
        return true;
    }

}