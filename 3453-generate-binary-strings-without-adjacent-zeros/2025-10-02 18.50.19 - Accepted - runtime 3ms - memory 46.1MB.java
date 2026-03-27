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
            list.add(s);
            return;
        }

        recur(n,s+"1",list);
        if(s.length() == 0 || s.charAt(s.length()-1) != '0')
        {
            recur(n,s+"0",list);
        }
    }

}