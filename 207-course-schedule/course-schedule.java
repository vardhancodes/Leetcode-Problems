class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean vis[] = new boolean[numCourses];
        boolean pathvis[] = new boolean[numCourses];

        for(int i = 0 ; i < vis.length ; i++)
        {
            if(!vis[i])
            {
                if(dfs(vis,pathvis,prerequisites,i))
                {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean dfs(boolean[] vis, boolean[] pathvis, int[][] pre, int i)
    {
        vis[i] = true;
        pathvis[i] = true;

        for(int ind = 0 ; ind < pre.length ; ind++)
        {
            if((i == pre[ind][1]) && (!vis[pre[ind][0]]))
            {
                if(dfs(vis,pathvis,pre,pre[ind][0]))
                {
                    return true;
                }
            }

            else if(i == pre[ind][1] && pathvis[pre[ind][0]])
            {
                return true;
            }
        }

        pathvis[i] = false;
        return false;
    }
}