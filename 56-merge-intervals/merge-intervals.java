class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1 ; i < intervals.length ; i++)
        {
            if(intervals[i][0] <= end)
            {
                start = Math.min(start,intervals[i][0]);
                end = Math.max(end,intervals[i][1]);
            }
            else
            {
                List<Integer> sublist = new ArrayList<>();
                sublist.add(start);
                sublist.add(end);
                list.add(sublist);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        List<Integer> sublist = new ArrayList<>();
        sublist.add(start);
        sublist.add(end);
        list.add(sublist);

        int[][] ans = new int[list.size()][2];

        for(int i = 0 ; i < list.size() ; i++)
        {
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }

        return ans;
        
    }
}