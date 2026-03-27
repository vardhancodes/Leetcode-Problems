class Solution {
    public int lengthOfLongestSubstring(String s) {
       int dup = 0;
       HashMap<Character,Integer> map = new HashMap<>();
       int windowStart = 0;
       int windowEnd = 0;
       int ans = Integer.MIN_VALUE;

       if(s.length() == 0)
       {
        return 0;
       }

       while(windowEnd < s.length())
       {
            map.put(s.charAt(windowEnd),map.getOrDefault(s.charAt(windowEnd),0)+1);
            if(map.get(s.charAt(windowEnd)) == 2)
            {
                dup++;
            }

            if(dup > 0)
            {
                ans = Math.max(ans,windowEnd-windowStart);
                while(dup > 0)
                {
                    if(map.get(s.charAt(windowStart)) == 2)
                    {
                        dup--;
                    }
                    map.put(s.charAt(windowStart),map.getOrDefault(s.charAt(windowStart),0)-1);
                    windowStart++;
                }
            }

            ans = Math.max(ans,windowEnd-windowStart+1);
            windowEnd++;

        }

        return ans;

    }
}