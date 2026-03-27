class Solution {
    public int numberOfSubstrings(String s) {
        int windowStart = 0;
        int windowEnd = 0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('b',1);
        map.put('c',1);
        int ucc = 3;
        int ans = 0;
        while(windowEnd < n)
        {
            map.put(s.charAt(windowEnd),map.getOrDefault(s.charAt(windowEnd),0)-1);
            if(map.get(s.charAt(windowEnd))==0)
            {
                ucc--;
            }
            if(ucc == 0)
            {
                while(ucc == 0)
                {
                    ans += s.length()-windowEnd;
                    map.put(s.charAt(windowStart),map.getOrDefault(s.charAt(windowStart),0)+1);
                    if(map.get(s.charAt(windowStart))>0)
                    {
                        ucc++;
                    }
                    windowStart++;
                }
            }
            windowEnd++;
            
        }
        return ans;
        
    }
}