class Solution {
    public int tribonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i = 3 ; i <=n ; i++)
        {
            int temp1 = b;
            int temp2 = a;
            a = b;
            b = c;
            c = temp1+temp2+c;
        }
        return c;
    }


}