class Solution {
    public int coinChange(int[] coins, int amount) {
        int ans[] = new int[1];
        ans[0] = Integer.MAX_VALUE;
        recur(coins,amount,0,ans,0);
        return (ans[0]==Integer.MAX_VALUE)?-1:ans[0];
    }
    public static void recur(int[] coins, int target , int index, int[] ans,int count)
    {
       if(index == coins.length)
       {
            if(target == 0)
            {
                ans[0] = Math.min(count,ans[0]);
            }
            return;
       }

       if(target >= coins[index])
       {
            recur(coins,target-coins[index],index,ans,count+1);
       }
       recur(coins,target,index+1,ans,count);

    }
}