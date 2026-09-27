class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> list = new ArrayList<>();
        for(int i = 0 ; i < n+1 ; i++)
        {
            list.add(new ArrayList<Pair>());
        }
        for(int i = 0 ; i < times.length ; i++)
        {
            Pair p = new Pair(times[i][1],times[i][2]);
            list.get(times[i][0]).add(p);
        }
        int dist[] = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.wt - b.wt);
        pq.add(new Pair(k,0));

        while(!pq.isEmpty())
        {
            Pair p1 = pq.poll();
            int node = p1.v;
        
            for(int i = 0 ; i < list.get(node).size() ; i++)
            {
                int v = list.get(node).get(i).v;
                int w = list.get(node).get(i).wt;

                if(dist[v] > dist[node] + w)
                {
                    dist[v] = dist[node] + w;
                    pq.add(new Pair(v,dist[v]));
                }
            }
        }

        int ans = Integer.MIN_VALUE;
        for(int i = 1 ; i < dist.length ; i++)
        {
            if(dist[i] == Integer.MAX_VALUE)
            {
                return -1;
            }

            if(ans < dist[i])
            {
                ans = dist[i];
            }
        }

        return ans;
    }
}


class Pair{
    int v; 
    int wt;

    Pair(int v, int wt)
    {
        this.v = v;
        this.wt = wt;
    }
}