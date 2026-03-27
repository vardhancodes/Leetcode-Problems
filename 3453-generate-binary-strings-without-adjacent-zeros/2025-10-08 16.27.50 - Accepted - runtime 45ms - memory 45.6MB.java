class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<String>();
        recur(list,"",n);
        return list;
    }
    public static boolean isValid(String s)
    {
        for(int i = 0 ; i < s.length()-1 ; i++)
        {
            if(s.charAt(i) == '0' && s.charAt(i+1) == '0')
            {
                return false;
            }
        }
        return true;
    }
    public static void recur(List<String> list, String s, int n  )
    {
        if(s.length() == n)
        {
            if(isValid(s))
            {
                list.add(s);
            }
            return;
        }

        recur(list, s+"0", n);
        recur(list, s+"1", n);

    }
    

}