class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i = 0 ; i < n/2 ; i++)
        {
            char firstchar = s[i];
            char lastchar = s[n-1-i];
            s[i] = lastchar;
            s[n-1-i] = firstchar;

        }

        
    }
}