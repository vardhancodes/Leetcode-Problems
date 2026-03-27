class Solution {
    public boolean isPalindrome(String s) {
        
        String lower = s.toLowerCase();
        String sp = lower.replace(" ","");
        String nospace = sp.replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = nospace.length()-1;
        boolean result;

        while(start < end)
        {
            if(nospace.charAt(start) != nospace.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }

        return true;

    }
}