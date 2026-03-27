class Solution {
    public int maxCoins(int[] piles) {
       Arrays.sort(piles);
       int ans = 0;
       int n = piles.length;
       if(n == 3)
       {
            return piles[1];
       }
       int alice = n-1;
       int me = n-2;
       int bob = 0;
       while(bob < me)
       {
            ans+=piles[me];
            me-=2;
            alice-=2;
            bob++;
       }
       return ans;
    }
}