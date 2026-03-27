class Solution {
    public int totalFruit(int[] fruits) {
        int windowStart = 0;
        int windowEnd = 0;
        int n = fruits.length;
        int len = 0;
        int ans = 0;
        int ucc = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(windowEnd < n)
        {
            if(!map.containsKey(fruits[windowEnd]))
            {
                ucc++;
            }
            map.put(fruits[windowEnd],map.getOrDefault(fruits[windowEnd],0)+1);
            if(ucc > 2)
            {
                while(ucc > 2)
                {
                    len = windowEnd - windowStart;
                    ans = Math.max(len,ans);
                    map.put(fruits[windowStart],map.getOrDefault(fruits[windowStart],0)-1);
                    if(map.get(fruits[windowStart]) == 0)
                    {
                        ucc--;
                        map.remove(fruits[windowStart]);
                    }
                    windowStart++;
                    
                }
            }
            len = windowEnd - windowStart + 1;
            ans = Math.max(len,ans);
            windowEnd++;
        }
        return ans;

    }
}