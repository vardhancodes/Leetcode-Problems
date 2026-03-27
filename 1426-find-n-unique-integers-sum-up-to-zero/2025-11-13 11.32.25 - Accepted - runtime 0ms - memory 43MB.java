class Solution {
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        int n2 = n-1;
        int sum = 0;
        if(n == 1)
        {
            ans[0] = 0;
            return ans;
        }
        if(n == 2)
        {
            ans[0] = -1;
            ans[1] = 1;
            return ans;
        }
        
        for(int i = 0; i < n2 ; i++)
            {
                ans[i] = i;
                sum+=i;
            }
        ans[n-1] = -sum;
        return ans;
        
    }
}