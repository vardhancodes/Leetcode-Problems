class Solution {
    public boolean isSubsequence(String s, String t) {
        int counter = 0;
        for(int i = 0 ; i < t.length() ; i++)
        {
            if(t.charAt(i) == s.charAt(counter))
            {
                counter++;
            }
            if(counter == s.length())
            {
                return true;
            }
        }
        return false;
    }
}