class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        int[] ans = new int[numCourses];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[] indegree = new int[numCourses];
        for(int i = 0 ; i < numCourses ; i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i = 0 ; i < prerequisites.length ; i++)
        {
            list.get(prerequisites[i][1]).add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }
        
        for(int i = 0 ; i < indegree.length ; i++)
        {
            if(indegree[i] == 0)
            {
                q.add(i);
            }
        }
        int ind = -1;
        while(!q.isEmpty())
        {
            int node = q.poll();
            ans[++ind] = node;
            count++;
            for(int i = 0 ; i < list.get(node).size() ; i++)
            {
                indegree[list.get(node).get(i)]--;
                if(indegree[list.get(node).get(i)] == 0)
                {
                    q.add(list.get(node).get(i));
                }
            }
        }
        if(count != numCourses)
        {
            return new int[0];
        }
        return ans;
    }
}