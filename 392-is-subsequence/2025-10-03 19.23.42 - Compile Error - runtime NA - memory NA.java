class Solution {
    public boolean isSubsequence(String s, String t) {
        int counter = 0;
        for(int i = 0 ; i < t.length() ; i++)
        {
            if(t[i] == s[counter])
            {
                counter++;
            }
            if(counter == s.size())
            {
                return true;
            }
        }
        return false;
    }
}