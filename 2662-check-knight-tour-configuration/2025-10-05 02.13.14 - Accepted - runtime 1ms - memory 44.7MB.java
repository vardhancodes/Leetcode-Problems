class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0] != 0)
        {
            return false;
        }
      return recur(grid,grid.length,0,0,0);
        
    }
    public static boolean isValid(int grid[][] , int i , int j , int n, int nextMove)
    {
        if(i < 0 || i >= n || j < 0 || j >= n || grid[i][j] != nextMove)
        {
            return false;
        }
        return true;

    }
    public static boolean recur(int[][] grid , int n ,  int i , int j , int moves)
    {        

        if(n*n-1 == moves)
        {
            return true;
        }

        int di[] = {2,2,-2,-2,1,-1,-1,1};
        int dj[] = {-1,1,1,-1,2,2,-2,-2};

        for(int ind = 0 ; ind < 8 ; ind++)
        {
            int nextI = i+di[ind];
            int nextJ = j+dj[ind];
            int nextMove = moves+1;
            if(isValid(grid,nextI,nextJ,n,nextMove))
            {
                if(recur(grid,n,nextI,nextJ,nextMove))
                {
                    return true;
                }

            }

        }
        return false;
    }
}