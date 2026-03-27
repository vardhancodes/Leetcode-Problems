class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowStart = 0;
        int windowEnd = 0;
        int n = s.length();
        int ans = 0;
        int maxLen = 0;
        if(s.length() == 0)
        {
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        while(windowEnd < n)
        {
            char ch = s.charAt(windowEnd);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch) > 1)
            {
                while(windowStart < windowEnd && map.get(ch) > 1)
                {
                    map.put(s.charAt(windowStart),map.getOrDefault(s.charAt(windowStart),0)-1);
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