class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0 ; i < matrix.length-1 ; i++)
        {
            for(int j = i+1 ; j < matrix[i].length;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0 ; i < matrix.length ; i++)
        {
            reverse(matrix[i],0,matrix[i].length-1);
        }
    }

    public static void reverse(int arr[], int start , int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}