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
                long val = ((long)n * (n + 1)) / 2;
                ans = (ans + val) % 1000000007;
            }
            else
            {
                i++;
            }
        }
        return (int)(ans % 1000000007);
    }
}