class Solution {
    public String minWindow(String s, String t) {
        int start = -1;
        int windowStart = 0;
        int windowEnd = 0;
        int n = s.length();
        int minlen = Integer.MAX_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        int ucc = 0;
        for(int i = 0 ; i < t.length() ; i++)
        {
            if(!map.containsKey(t.charAt(i)))
            {
                ucc++;
            }
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        while(windowEnd < n)
        {
            if(map.containsKey(s.charAt(windowEnd)))
            {
                map.put(s.charAt(windowEnd),map.getOrDefault(s.charAt(windowEnd),0)-1);
                if(map.get(s.charAt(windowEnd)) == 0)
                {
                    ucc--;
                }
            }
            if(ucc == 0)
            {    
                while( ucc == 0)
                {
                    int len = windowEnd-windowStart+1;
                    if(len < minlen)
                    {
                        start = windowStart;
                        minlen = len;
                    }
                    if(map.containsKey(s.charAt(windowStart)))
                    {
                        map.put(s.charAt(windowStart),map.getOrDefault(s.charAt(windowStart),0)+1);
                        if(map.get(s.charAt(windowStart)) > 0)
                        {
                            ucc++;
                        }
                    }
                    windowStart++;

                }
        
            }
            windowEnd++;
        }
        return (start == -1)?"":s.substring(start,start+minlen);
    }
}