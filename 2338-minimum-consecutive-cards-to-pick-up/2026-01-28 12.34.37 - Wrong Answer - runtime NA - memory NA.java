class Solution {
    public int minimumCardPickup(int[] cards) {
        int ans = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowEnd = 0;
        int pairfound = 0;
        HashMap<Integer,Integer> map = new HashMap<>();  
        while(windowEnd < cards.length)
        {
            map.put(cards[windowEnd],map.getOrDefault(cards[windowEnd],0)+1);
            if(map.get(cards[windowEnd]) == 2)
            {
                pairfound++;
            }

            if(pairfound == 1)
            {
                ans = Math.min(ans,windowEnd-windowStart+1);
                while(windowEnd <= windowStart && pairfound == 1)
                {
                    if(map.get(cards[windowStart]) == 2)
                    {
                        pairfound--;
                    }
                    map.put(cards[windowStart],map.getOrDefault(cards[windowStart],0)-1);
                    windowStart++;
                }
            }
            windowEnd++;
        }
        return (ans == Integer.MAX_VALUE)?-1:ans;
    }
}