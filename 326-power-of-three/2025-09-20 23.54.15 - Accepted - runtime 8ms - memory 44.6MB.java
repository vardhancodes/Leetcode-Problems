class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        return recur(n);
    }

    public static boolean recur(int n) {
        if (n == 1) {   // base case
            return true;
        }
        if (n % 3 != 0) {  // not divisible by 3
            return false;
        }
        return recur(n / 3);  // keep dividing
    }
}
