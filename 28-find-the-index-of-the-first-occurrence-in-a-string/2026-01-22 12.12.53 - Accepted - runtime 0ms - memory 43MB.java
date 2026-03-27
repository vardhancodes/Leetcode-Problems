class Solution {
    public int strStr(String haystack, String needle) {
        int ans = -1;
        int n = haystack.length(); 
        int m = needle.length();
        for(int i = 0 ; i <= n-m ; i++)
        {
            if(needle.equals(haystack.substring(i,i+m)))
            {
                ans = i;
                return i;
            }
        }
        return ans;
    }
}