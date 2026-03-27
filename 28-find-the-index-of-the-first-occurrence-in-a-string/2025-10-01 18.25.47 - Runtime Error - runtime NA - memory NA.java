class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        for(int i = 0 ; i < haystack.length() ; i++)
        {
            if(haystack.charAt(i) == needle.charAt(0))
            {
                if(haystack.substring(i,i+n).equals(needle))
                {
                    return i;
                }
            }   
        }
        return -1;
    }
}