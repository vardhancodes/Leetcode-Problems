class Solution {
    public boolean isBipartite(int[][] graph) {
        int vis[] = new int[graph.length];
        Arrays.fill(vis,-1);

        for(int i = 0 ; i < vis.length ; i++)
        {
           if(vis[i] == -1)
           {
                vis[i] = 0;
                if(!dfs(vis,graph,i))
                {
                    return false;
                }
           }
        }

        return true;
    }

    public boolean dfs(int[] vis, int[][] graph, int i)
    {

        for(int ind = 0 ; ind < graph[i].length ; ind++)
        {
            int ni = graph[i][ind];
            if(vis[ni] == -1)
            {
                vis[ni] = 1-vis[i];
                if(!dfs(vis,graph,ni))
                {
                    return false;
                }
            }

            else if(vis[ni] == vis[i])
            {
                return false;
            }
        }

        return true;
    }



}