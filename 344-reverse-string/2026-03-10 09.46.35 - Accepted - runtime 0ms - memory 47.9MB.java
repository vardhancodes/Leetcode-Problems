class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start < end)
        {
            char firstchar = s[start];
            char lastchar = s[end];
            s[start] = lastchar;
            s[end] = firstchar;
            start++;
            end--;

        }
        
    }

    

}