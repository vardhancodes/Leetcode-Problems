class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        int windowStart = 0;
        int windowEnd = 0;
        int ucc = 0;
        int start = -1;
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < t.length() ; i++)
        {
            if(!map.containsKey(t.charAt(i)))
            {
                ucc++;
            }
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }

        while(windowEnd < s.length())
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
                

                while(ucc == 0)
                {
                    if((windowEnd-windowStart+1) < ans)
                    {
                        start = windowStart;
                        ans = windowEnd-windowStart+1;
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

        return (start == -1)?"":s.substring(start,start+ans);


    }
}