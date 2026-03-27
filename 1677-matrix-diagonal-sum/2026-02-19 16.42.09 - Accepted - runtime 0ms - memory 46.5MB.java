class Solution {
    public int diagonalSum(int[][] mat) {
        int end = mat.length-1;
        int sum = 0;
        for(int i = 0 ; i < mat.length ; i++)
        {
            if(mat[i][i] != -1)
            {
                sum += mat[i][i];
                mat[i][i] = -1;
            }
            if(mat[i][end] != -1)
            {
                sum += mat[i][end];
                mat[i][end] = -1;
            }
            end--;
        }
        return sum;

    }
}