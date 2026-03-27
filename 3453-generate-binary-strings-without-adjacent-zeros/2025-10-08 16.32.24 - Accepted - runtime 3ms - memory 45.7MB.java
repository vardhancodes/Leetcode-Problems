class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<String>();
        recur(list,"",n);
        return list;
    }
    public static void recur(List<String> list, String s, int n  )
    {
        if(s.length() == n)
        {
            list.add(s);
            return;
        }

        recur(list, s+"1", n);
        if(s.length() == 0 || s.charAt(s.length()-1) == '1')
        {
            recur(list, s+"0", n);
        }

    }
    

}