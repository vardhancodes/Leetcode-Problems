class Solution {
    public int diagonalSum(int[][] mat) {
        int i = 0 , j = 0;
        int sum = 0;
        while(i < mat.length && j < mat.length)
        {
            if(mat[i][j] != -1)
            {
                sum += mat[i][j];
                mat[i][j]  = -1;
            }
            i++;
            j++;
        }
        System.out.print(sum);
        i = 0;
        j = mat.length-1;
        while(i < mat.length && j >= 0)
        {
            if(mat[i][j] != -1)
            {
                sum += mat[i][j];
                mat[i][j]  = -1;
            }
            i++;
            j--;
        }

        return sum;

    }
}