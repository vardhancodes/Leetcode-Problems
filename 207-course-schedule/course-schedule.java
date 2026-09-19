class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[] indegree = new int[numCourses];
        for(int i = 0 ; i < numCourses ; i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i = 0 ; i < prerequisites.length ; i++)
        {
            list.get(prerequisites[i][0]).add(prerequisites[i][1]);
            indegree[prerequisites[i][1]]++;
        }
        
        for(int i = 0 ; i < indegree.length ; i++)
        {
            if(indegree[i] == 0)
            {
                q.add(i);
            }
        }
        
        while(!q.isEmpty())
        {
            int node = q.poll();
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
        
        return numCourses == count;
    }
}