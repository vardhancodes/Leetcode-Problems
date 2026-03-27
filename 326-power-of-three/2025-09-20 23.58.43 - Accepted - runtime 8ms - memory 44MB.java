class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        return recur(n);
    }

    public static boolean recur(int n) {
       if(n==1)
       {
            return true;
       }
       if(n%3 !=0)
       {
            return false;
       }
       return recur(n/3);
    }
}
