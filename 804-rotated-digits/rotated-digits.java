class Solution {
    public int rotatedDigits(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(8,8);
        map.put(2,5);
        map.put(6,9);
        map.put(5,2);
        map.put(9,6);

        int ans = 0;

        for(int i = 1; i <= n ; i++)
        {
            if(isGood(i,map))
            {
                ans++;
            }
        }

        return ans;
        
    }

    public static boolean isGood(int n, HashMap<Integer,Integer> map)
    {
        int temp = n;
        int ans = 0;
        int counter = 1;

        while(n != 0)
        {
            int rem = n%10;
            if(map.containsKey(rem))
            {
                ans += map.get(rem)*counter;
            }
            else
            {
                return false;
            }
            counter *= 10;
            n /= 10;
        }

        if(temp != ans)
        {
            return true;
        }
        return false;
    }
}