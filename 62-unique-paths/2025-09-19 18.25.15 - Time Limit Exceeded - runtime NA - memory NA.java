class Solution {
    public int uniquePaths(int m, int n) {
        return ways(m,n,0,0);
    }
    public static int ways(int m , int n , int row , int column)
    {
        if(row == m-1 || column == n-1)
        {
            return 1;
        }
        return ways(m,n,row+1,column)+ways(m,n,row,column+1);
    }
}