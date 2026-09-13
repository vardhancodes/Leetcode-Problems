class Solution {
    int start = -1;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < numCourses ; i++)
        {
            list.add(new ArrayList<>());
        }
        
        for(int i = 0 ; i < prerequisites.length ; i++)
        {
            list.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        boolean vis[] = new boolean[numCourses];
        boolean pathvis[] = new boolean[numCourses];
        int[] ans = new int[numCourses];
        
        for(int i = 0 ; i < numCourses ; i++)
        {
            if(!vis[i])
            {
                if(dfs(vis,pathvis,i,list,ans,stack))
                {
                    return new int[0];
                }
            }
        }
        int i = 0;
        while(!stack.isEmpty())
        {
            ans[i] = stack.pop();
            i++;
        }

        return ans;
    }

    public boolean dfs(boolean []vis, boolean[] pathvis, int i, ArrayList<ArrayList<Integer>> list, int[] ans, Stack<Integer> stack)
    {
        vis[i] = true;
        
        pathvis[i] = true;
        
        for(int ind = 0 ; ind < list.get(i).size() ; ind++)
        {
            int ni = list.get(i).get(ind);
            if(!vis[ni])
            {
                if(dfs(vis,pathvis,ni,list,ans,stack))
                {
                    return true;
                }
                
            }
            
            else if(vis[ni] && pathvis[ni])
            {
                return true;
            }
            
        }
        stack.push(i);
        pathvis[i] = false;
        return false;
    }
}