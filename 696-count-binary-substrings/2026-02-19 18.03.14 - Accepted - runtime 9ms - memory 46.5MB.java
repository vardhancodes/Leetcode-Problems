class Solution {
    public int countBinarySubstrings(String s) {
        char prev = s.charAt(0);
        int group1 = 1;
        int group2 = 0;
        int ans = 0;
        for(int i = 1 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == prev)
            {
                group1++;
            }
            else
            {
                ans += Math.min(group1,group2);
                group2 = group1;
                group1 = 1;
                prev = s.charAt(i);
                
            }
            
        }
        return ans + Math.min(group1,group2);
    }
}