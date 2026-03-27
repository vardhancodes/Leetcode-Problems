class Solution {
    public int countBinarySubstrings(String s) {
        char prev = s.charAt(0);
        int c1 = 1;
        int c2 = 0;
        int ans = 0;
        for(int i = 1 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == prev)
            {
                c1++;
            }
            else
            {
                c2++;
                ans += Math.min(c1,c2);
                prev = s.charAt(i);
                
            }
            
        }
        return ans;
    }
}