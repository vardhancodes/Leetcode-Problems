class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        long negativeelements = 0;
        int zerocount=0;
        long smallestnegative = Long.MAX_VALUE;
        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = 0 ; j < matrix[i].length ; j++)
            {
                sum += Math.abs(matrix[i][j]);
                if(matrix[i][j] < 0)
                {
                    negativeelements++;
                }
                if(Math.abs(matrix[i][j]) < Math.abs(smallestnegative))
                {
                    smallestnegative = Math.abs(matrix[i][j]);
                }
                if(matrix[i][j] == 0)
                {
                    zerocount++;
                }
                
            }
        }
        if(negativeelements == 0 || negativeelements%2 == 0)
        {
            return sum;
        }
        else
        {
            if(zerocount > 0)
            {
                return sum;
            }
        }
        return sum-smallestnegative-smallestnegative;
        
    }
}