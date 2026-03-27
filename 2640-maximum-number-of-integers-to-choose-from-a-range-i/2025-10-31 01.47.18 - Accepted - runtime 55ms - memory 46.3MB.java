class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < banned.length ; i++)
        {
            map.put(banned[i],map.getOrDefault(banned[i],0)+1);
        }
        int count = 0;
        int sum = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            if(sum+i <= maxSum)
            {
                if(!map.containsKey(i))
                {
                    count++;
                    sum+=i;
                }
                
            }
        }
        return count;
    }
}