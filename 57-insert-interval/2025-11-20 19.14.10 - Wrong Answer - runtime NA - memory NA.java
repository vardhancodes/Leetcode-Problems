class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int s2 = newInterval[0];
        int e2 = newInterval[1];
        int StartRange = Integer.MAX_VALUE;
        int EndRange = -1;
        List<List<Integer>> list = new ArrayList<>();
        boolean merged = false;
        for(int i = 0 ; i < intervals.length ; i++)
        {
            int s1 = intervals[i][0];
            int e1 = intervals[i][1];
            if(s2 > e1)
            {
                List<Integer> sublist = new ArrayList<>();
                sublist.add(s1);
                sublist.add(e1);
                list.add(sublist);
            }
            else if(s1<=e2 && s2<=e1)
            {
                int start = (s1<s2)?s1:s2;
                StartRange = Math.min(StartRange,start);
                EndRange = Math.max(e1,e2);
            }
            else
            {
                if(!merged)
                {
                    List<Integer> sublist = new ArrayList<>();
                    sublist.add(StartRange);
                    sublist.add(EndRange);
                    list.add(sublist);
                    merged = true;
                }
                List<Integer> sublist = new ArrayList<>();
                sublist.add(s1);
                sublist.add(e1);
                list.add(sublist);
            }
        }
        if(!merged)
        {
            List<Integer> sublist = new ArrayList<>();
            sublist.add(newInterval[0]);
            sublist.add(newInterval[1]);
            list.add(sublist);
        }
        int ans[][] = new int[list.size()][2];
        for(int i = 0 ; i < list.size() ; i++)
        {
            for(int j = 0 ; j < list.get(i).size() ; j++)
            {
                ans[i][j] = list.get(i).get(j);
            }
        }
        return ans;
    }
}