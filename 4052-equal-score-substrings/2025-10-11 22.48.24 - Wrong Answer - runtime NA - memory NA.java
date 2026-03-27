class Solution {
    public boolean scoreBalance(String s) {
        int sum = 0;
        for(int i = 0 ; i < s.length() ; i++)
            {
                sum+=s.charAt(i) - 96;
            }
        if(sum%2 == 0)
        {
            return true;
        }
        return false;
    }
}