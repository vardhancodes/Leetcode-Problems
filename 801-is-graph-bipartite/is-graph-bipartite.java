class Solution {
    public boolean isBipartite(int[][] graph) {
        int vis[] = new int[graph.length];
        Arrays.fill(vis,-1);

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0 ; i < vis.length ; i++)
        {
            if(vis[i] == -1)
            {
                q.add(i);
                vis[i] = 0;
                while(!q.isEmpty())
                {
                    int curr = q.poll();
                    for(int ind = 0 ; ind < graph[curr].length ; ind++)
                    {
                        int ni = graph[curr][ind];
                        if(vis[ni] == -1)
                        {
                            
                            vis[ni] = 1 - vis[curr];
                            q.add(ni);

                        }

                        else if(vis[ni] == vis[curr])
                        {
                            return false;
                        }
                        
                    }
                }
            }
        }

        return true;
    }

}