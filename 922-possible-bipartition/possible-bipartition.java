class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < n+1 ; i++)
        {
            list.add(new ArrayList<Integer>());
        }
        for(int i = 0 ; i < dislikes.length ; i++)
        {
            list.get(dislikes[i][0]).add(dislikes[i][1]);
            list.get(dislikes[i][1]).add(dislikes[i][0]);
            
            
        }

        int[] color = new int[n+1];
        
        Arrays.fill(color,-1);

        Queue<Integer> q = new LinkedList<>();
        for(int k = 1 ; k < color.length ; k++)
        {
            if(color[k] == -1)
            {
                color[k] = 0;
                q.offer(k);

                while(!q.isEmpty())
                {
                    int node = q.poll();

                    for(int i = 0 ; i < list.get(node).size() ; i++)
                    {
                        int next = list.get(node).get(i);
                        if (color[next] == -1)
                        {
                            color[next] = 1 - color[node];
                            q.add(next);
                        }
                        else if(color[next] == color[node])
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