class Solution {
    public int numIslands(char[][] grid) {
        //checking if the current digit has land 
        int n = grid.length;
        int count = 0;
        for(int i = 0 ; i < n ; i++)
        {
            int m = grid[i].length;
            for(int j = 0 ; j < m ; j++)
            {
                if(grid[i][j] == '1')
                {
                    recur(grid,i,j,n,m);
                    count++;
                }
            }
        }
        return count;
    }

    public static void recur(char[][] grid, int i , int j ,int n , int m)
    {
        //deadends
        if(i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == '2' || grid [i][j] == '0')
        {
            return;
        }

        grid[i][j] = '2';

        //FOUR options:
        //lexicographically -> D , L , R, U
        recur(grid,i+1,j,n,m);
        recur(grid,i,j-1,n,m);
        recur(grid,i,j+1,n,m);
        recur(grid,i-1,j,n,m);




    }
}