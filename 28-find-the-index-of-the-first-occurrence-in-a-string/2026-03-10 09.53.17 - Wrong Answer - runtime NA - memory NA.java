class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int m = haystack.length();
        for(int i = 0 ; i <= haystack.length()-needle.length() ; i++)
        {
            if(haystack.contains(needle))
            {
                return i;
            }
        }

        return -1;
    }
}