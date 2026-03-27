class Solution {
    public long removeZeros(long n) {
        String s = String.valueOf(n);
        s.replace(0,"");
        return Integer.parseInt(s);
    }
}