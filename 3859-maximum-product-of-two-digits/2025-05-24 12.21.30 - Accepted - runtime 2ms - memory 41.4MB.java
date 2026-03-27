class Solution {
    public int maxProduct(int n) {
    int count = (int)(Math.log(n) / Math.log(10)) + 1;
    int ans[] = new int[count+1];
    int i = 0;

    while(n != 0)
    {
        
        ans[i] = n%10;
        n /= 10;
        i++;
    }
    Arrays.sort(ans);
    int result = ans[count] * ans [count-1];
    return result;


        
    }
}