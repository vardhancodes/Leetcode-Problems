class Solution {
    public int numSub(String s) {
        long ans = 0;
        int i = 0;
        while(i<s.length())
        {
            
            if(s.charAt(i) == '1')
            {
                int n = 0;
                while(i < s.length() && s.charAt(i) == '1')
                {
                    i++;
                    n++;
                }
                ans+=(n + 1) * n/2;
            }
            else
            {
                i++;
            }
        }
        return (int)(ans % 1000000007);
    }
}