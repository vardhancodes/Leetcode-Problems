class Solution {
    public int maxProduct(int n) {
        int res = 1;
        while(n!=0)
        {
            int rem = n%10;
            res = res*rem;
            n = n/10;
        }
        return res;
        
        
    }
}