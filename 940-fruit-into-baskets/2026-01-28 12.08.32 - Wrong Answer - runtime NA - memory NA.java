class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ubc = 0;
        int windowStart = 0;
        int windowEnd = 0;
        int ans = 0;
        while(windowEnd < fruits.length)
        {
            if(!map.containsKey(fruits[windowEnd]))
            {
                ubc++;
            }
            map.put(fruits[windowEnd],map.getOrDefault(fruits[windowEnd],0)+1);

            if(ubc > 2)
            {
                ans = Math.max(ans,windowEnd-windowStart);
                while(windowStart <= windowEnd && ubc > 2)
                {
                    map.put(fruits[windowStart],map.getOrDefault(fruits[windowStart],0)-1);
                    if(map.get(fruits[windowStart]) == 0)
                    {
                        ubc--;
                    }
                    windowStart++;
                }
            }
            ans = Math.max(ans,windowEnd-windowStart+1);
            windowEnd++;
        }
        return ans;
    }
}