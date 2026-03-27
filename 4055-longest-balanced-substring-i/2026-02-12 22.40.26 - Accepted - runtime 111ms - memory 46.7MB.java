class Solution {
    public int longestBalanced(String s) {
        int ans = 0;
        for(int i = 0 ; i < s.length();i++)
            {
                int freq[] = new int[26];
                for(int j = i; j < s.length() ; j++)
                    {
                        freq[s.charAt(j)-97]++;
                        int balance = 0;
                        boolean balanced = true;
                        for(int k = 0 ; k < freq.length ; k++)
                        {
                            if(freq[k] > 0)
                            {
                                if(balance == 0)
                                {
                                    balance = freq[k];
                                }
                                else if(balance != freq[k])
                                {
                                    balanced = false;
                                    break;
                                }
                            }
                        }
                        if(balanced)
                        {
                            ans = Math.max(ans,j-i+1);
                        }
                    }
            }
        return ans;
    }

    
}