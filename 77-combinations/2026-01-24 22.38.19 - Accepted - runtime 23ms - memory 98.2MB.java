class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        recur(list,sublist,n,k,1);
        return list;
    }
    public static void recur(List<List<Integer>> list,List<Integer> sublist, int n , int k , int index)
    {
        if(sublist.size() == k)
        {
            list.add(new ArrayList<>(sublist));
            return;
        }

        for(int i = index ; i <= n ; i++)
        {
            sublist.add(i);
            recur(list,sublist,n,k,i+1);
            sublist.remove(sublist.size()-1);
        }
    }
}
