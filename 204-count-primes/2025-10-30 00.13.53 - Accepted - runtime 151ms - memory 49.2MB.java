class Solution {
    public int countPrimes(int n) {
        boolean arr[] = new boolean[n];
        Arrays.fill(arr,true);
        for(int i = 2 ; i < n ; i++)
        {
            if(arr[i] == true)
            {
                for(int j = i+i ; j < n ; j+=i)
                {
                    arr[j] = false;
                }
            }
        }


        int ans = 0;
        for(int i = 2 ; i < arr.length ; i++)
        {
            if(arr[i] == true)
            {
                ans++;
            }
        }

        return ans;
    }
}