class Solution {
    public long minCost(String s, int[] cost) {
        HashMap<Character,Long> map = new HashMap<>();
        long total = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0L)+cost[i]);
            total += cost[i];
        }
        long max = 0;
        if(map.size() == 1)
        {
            return 0;
        }
        for(Map.Entry<Character,Long> entry : map.entrySet())
        {
            if(entry.getValue()>max)
            {
                max = entry.getValue();
            }
        }
        return total - max;
    }
}