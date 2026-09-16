class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int ans[][] = new int[mat.length][mat[0].length];
        boolean vis[][] = new boolean[mat.length][mat[0].length];
        int di[] = {-1,0,1,0};
        int dj[] = {0,1,0,-1};

        Queue<T> q = new LinkedList<>();

        for(int i = 0 ; i < mat.length ; i++)
        {
            for(int j = 0 ; j < mat[0].length ; j++)
            {
                if(mat[i][j] == 0 && !vis[i][j])
                {
                    ans[i][j] = 0;
                    vis[i][j] = true;
                    q.add(new T(i,j,0));
                }
            }
        }

        while(!q.isEmpty())
        {
            T node = q.poll();
            int a = node.a;
            int b = node.b;
            int c = node.c;

            for(int i = 0 ; i < 4 ; i++)
            {
                int ni = a+di[i];
                int nj = b+dj[i];

                if(ni >= 0 && ni < mat.length && nj >= 0 && nj < mat[0].length && !vis[ni][nj])
                {
                    ans[ni][nj] = c+1;
                    vis[ni][nj] = true;
                    q.add(new T(ni,nj,c+1));
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

    T(int a,int b,int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}