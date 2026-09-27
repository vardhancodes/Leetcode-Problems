class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.f - a.f);
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }

        int ans[] = new int[k];

        for(int i = 0 ; i < k ; i++)
        {
            Pair p = pq.poll();
            ans[i] =  p.num;
        }

        return ans;
    }
}

class Pair{
    int num;
    int f;

    Pair(int num, int f)
    {
        this.num = num;
        this.f = f;
    }
}