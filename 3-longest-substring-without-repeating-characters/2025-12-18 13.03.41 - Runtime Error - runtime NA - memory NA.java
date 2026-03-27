class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowStart = 0;
        int windowEnd = 0;
        int n = s.length();
        int ans = 0;
        int maxLen = 0;

        int freq[] = new int[26];
        while(windowEnd < n)
        {
            char ch = s.charAt(windowEnd);
            freq[ch-97]++;
            if(freq[ch-97] > 1)
            {
                while(windowStart < windowEnd && freq[ch-97] > 1)
                {
                    freq[s.charAt(windowStart) -97]--;
                    windowStart++;
                }

            }
            else
            {
                maxLen = windowEnd-windowStart+1;
                ans = Math.max(ans,maxLen);
            }
            windowEnd++;
        }
        return ans;
    }
}