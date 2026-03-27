class Solution {
    public int longestBalanced(String s) {
        int ans = 0;
        for(int i = 0 ; i < s.length();i++)
            {
                int freq[] = new int[26];
                for(int j = i; j < s.length() ; j++)
                    {
                        freq[s.charAt(j)-97]++;
                        if(isBalanced(freq))
                           { 
                                ans = Math.max(ans,j-i+1);
                           }
                    }
            }
        return ans;
    }

    public static boolean isBalanced(int []freq)
    {
        int currfreq = 0;
        for(int i = 0 ; i < freq.length ; i++)
            {
                if(freq[i] > 0)
                {
                    if(currfreq == 0)
                    {
                        currfreq = freq[i];
                    }
                    else if(currfreq != freq[i])
                    {
                        return false;
                    }
                }
            }
        return true;
    }
}