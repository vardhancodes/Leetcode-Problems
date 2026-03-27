class Solution {
    public int[] sumZero(int n) {
        int n2 = n-1;
        int sum = 0;
        int ans[] = new int[n];
        for(int i = 0; i < n2 ; i++)
            {
                ans[i] = i;
                sum+=i;
            }
        ans[n-1] = -sum;
        return ans;
        
    }
}