class Solution {
    public boolean scoreBalance(String s) {
        int totalsum = 0;
        for(int i = 0 ; i < s.length() ; i++)
            {
                totalsum+=s.charAt(i) - 96;
            }
        int sum1 = 0;
        for(int i = 0 ; i < s.length() ; i++)
            {
                sum1+= s.charAt(i) - 96;
                int sum2 = totalsum - sum1;
                if(sum1 == sum2)
                {
                    return true;
                }
            }
        return false;
    }
}