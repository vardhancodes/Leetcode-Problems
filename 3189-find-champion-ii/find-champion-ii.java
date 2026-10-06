class Solution {
    public int findChampion(int n, int[][] edges) {
        int count = 0;
        int ans = 0;
        int indegree[] = new int[n];

        for(int i = 0 ; i < edges.length ; i++)
        {
            indegree[edges[i][1]]++;  
        }

        for(int i = 0 ; i < indegree.length ; i++)
        {
            if(indegree[i] == 0)
            {
                count++;
                ans = i;
            }
        }

        return (count==1)?ans:-1;
    }
}