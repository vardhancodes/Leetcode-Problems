class Solution {
    public int minimumCardPickup(int[] cards) {
        int ans = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowEnd = 0;
        int pairfound = 0;
        int lastseen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();  
        for(int i = 0 ; i < cards.length ; i++)
        {
            if(map.containsKey(cards[i]))
            {
                ans = Math.min(ans,i-map.get(cards[i])+1);
            }
            map.put(cards[i],i);
        }
        return (ans==Integer.MAX_VALUE)?-1:ans;
    }
}