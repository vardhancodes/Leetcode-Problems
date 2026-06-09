class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int left = 0;
        int right = matrix[0].length-1; 
        int bottom = matrix.length-1;

        List<Integer> list = new ArrayList<>();

        while(top <= bottom && left <= right)
        {
            //right 
            for(int j = left; j <= right ; j++)
            {
                list.add(matrix[top][j]);
            }
            top++;
            
            //bottom
            for(int i = top; i <= bottom; i++)
            {
                list.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                //left
                for(int j = right ; j >= left ; j--)
                {
                    list.add(matrix[bottom][j]);
                }
                bottom--;

            }

            if( left <= right)
            {
                //top
                for(int i = bottom; i>= top ; i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
            }    

        }
        return list;
    }
}