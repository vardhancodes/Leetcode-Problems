class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        if(m > n)
        {
            return -1;
        }
        int res = -1;
        Arrays.sort(position);
        int start = 1;
        int end = position[n-1] - position[0];
        while(start <= end)
        {
            int mid = start+(end-start)/2;
            if(isPossible(mid,position,m))
            {
                res = mid;
                start = mid+1;
            }
            else 
            {
                end = mid-1;
            }
        }
        return res;
    }

    public static boolean isPossible(int currentdist , int[] position, int magnets)
    {
        int currentmagnet = 1;
        int lastmagnetposition = position[0];

        for(int i = 0 ; i < position.length ; i++)
        {
            if(position[i] - lastmagnetposition >= currentdist)
            {
                currentmagnet++;
                lastmagnetposition = position[i];
            }
            if(currentmagnet >= magnets)
            {
                return true;
            }
        }
        return false;
    }
}