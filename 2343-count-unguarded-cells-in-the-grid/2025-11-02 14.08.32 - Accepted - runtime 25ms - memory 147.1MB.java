class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int matrix[][] = new int[m][n];
        for(int i = 0 ; i < guards.length ; i++)
        {
            int r = guards[i][0];
            int c = guards[i][1];
            matrix[r][c] = 1;
        }
        for(int j = 0 ; j < walls.length ; j++)
        {
            int r = walls[j][0];
            int c = walls[j][1];
            matrix[r][c] = 2;
        }

        //guards can see up , down , right and left
        int di[] = {-1,1,0,0};
        int dj[] = {0,0,1,-1};
        for(int i = 0 ; i < guards.length ; i++)
        {
            int r = guards[i][0];
            int c = guards[i][1];
            for(int ind = 0 ; ind < 4 ; ind++)
            {
                int nr = r+di[ind];
                int nc = c+dj[ind];
                while(nr>=0 && nr < m && nc >=0 && nc < n && matrix[nr][nc] != 2 && matrix[nr][nc] != 1)
                {
                    if(matrix[nr][nc] == 0)
                    {
                        matrix[nr][nc] = 3;
                    }
                    nr+=di[ind];
                    nc+=dj[ind];
                }
            }
        }

        int ans = 0;
        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = 0 ; j < matrix[0].length ; j++)
            {
                if(matrix[i][j] == 0)
                {
                    ans++;
                }
            }
        }
        return ans;


    }
}