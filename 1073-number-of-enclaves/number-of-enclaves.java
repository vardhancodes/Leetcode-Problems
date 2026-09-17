class Solution {
    public int numEnclaves(int[][] grid) {
        int ans = 0;
        int di[] = {-1,0,1,0};
        int dj[] = {0,1,0,-1};
        //rows
        Queue<T> q = new LinkedList<>();
        for(int j = 0 ; j < grid[0].length ; j++)
        {
            if(grid[0][j] == 1)
            {
                grid[0][j] = -1;
                q.add(new T(0,j,0));
            }
            if(grid[grid.length-1][j] == 1)
            {
                grid[grid.length-1][j] = -1;
                q.add(new T(grid.length-1,j,0));
            }
        }

        //columns

        for(int i = 1 ; i < grid.length-1 ; i++)
        {
            if(grid[i][0] == 1 )
            {
                grid[i][0] = -1;
                q.add(new T(i,0,0));
            }
            if(grid[i][grid[0].length-1] == 1)
            {
                grid[i][grid[0].length-1] = -1;
                q.add(new T(i,grid[0].length-1,0));
            }
        }

        while(!q.isEmpty())
        {
            T node = q.poll();
            int a = node.a;
            int b = node.b;
            int c = node.c;

            for(int ind = 0 ; ind < 4 ; ind++)
            {
                int ni = a+di[ind];
                int nj = b+dj[ind];

                if(ni >= 0 && ni < grid.length && nj >= 0 && nj < grid[0].length && grid[ni][nj] == 1)
                {
                    grid[ni][nj] = -1;
                    q.add(new T(ni,nj,c+1));
                }
            }

        }


        for(int i = 0 ; i < grid.length; i++)
        {
            for(int j = 0 ; j < grid[0].length ; j++)
            {
                if(grid[i][j] == 1)
                {
                    ans++;
                }
            }
        }

        return ans;
    }
}

class T{
    int a;
    int b; 
    int c;

    T(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}