class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> list = new ArrayList<>();
        int index = 0;
        int n = intervals.length;
        int StartRange = intervals[0][0];
        int EndRange = intervals[0][1];
        for(int i = 1 ; i < n ; i++)
        {
            if(EndRange >= intervals[i][0])
            {
                EndRange = Math.max(intervals[i][1],EndRange);
            }
            else
            {
                List<Integer> sublist = new ArrayList<>();
                sublist.add(StartRange);
                sublist.add(EndRange);
                list.add(sublist);
                StartRange = intervals[i][0];
                EndRange = intervals[i][1];
            }
        }
        List<Integer> sublist = new ArrayList<>();
        sublist.add(StartRange);
        sublist.add(EndRange);
        list.add(sublist);
        int ans[][] = new int[list.size()][list.get(0).size()];
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