class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int vis[] = new int[graph.length];
        int pathvis[] = new int[graph.length];
        int check[] = new int[graph.length];
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < vis.length ; i++)
        {
            if(vis[i] == 0)
            {
                dfs(vis,pathvis,i,graph,check);
            }
        }

        for(int i = 0 ; i < check.length ; i++)
        {
            if(check[i] == 1)
            {
                list.add(i);
            }
        }

        return list;
    }

    public boolean dfs(int[] vis, int[] pathvis, int i, int[][] graph, int[] check)
    {
        vis[i] = 1;
        pathvis[i] = 1;

        for(int ind = 0 ; ind < graph[i].length ; ind++)
        {
            int ni = graph[i][ind];
            if(vis[ni] == 0)
            {
                if(!dfs(vis,pathvis,ni,graph,check))
                {
                    pathvis[i] = 0;
                    return false;
                }
            }

            else if(pathvis[ni] == 1 || check[ni] == 0)
            {
                pathvis[i] = 0;
                return false;
            }
        }

        check[i] = 1;
        pathvis[i] = 0;
        return true;
        
    }


}