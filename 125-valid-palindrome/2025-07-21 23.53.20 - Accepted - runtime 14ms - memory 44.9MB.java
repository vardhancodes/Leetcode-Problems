class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        String s3 = s1.trim();
        String s2 = s3.replaceAll("[^a-zA-Z0-9]", "");
        int start = 0 ; 
        int end = s2.length()-1;

        while(start<end)
        {
            if(s2.charAt(start) != s2.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}