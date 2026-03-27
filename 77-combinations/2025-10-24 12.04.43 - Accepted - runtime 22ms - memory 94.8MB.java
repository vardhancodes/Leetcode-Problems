class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> sublist = new ArrayList<Integer>();
        recur(list,sublist,1,n,k);
        return list;
    }

    public void recur(List<List<Integer>> list , List<Integer> sublist , int ind , int n , int k)
    {
        if(sublist.size() == k)
        {
            list.add(new ArrayList<>(sublist));
            return;
        }

        for(int i = ind ; i <= n ; i++)
        {
            sublist.add(i);
            recur(list,sublist,i+1,n,k);
            sublist.remove(sublist.size()-1);
        }
    }
    
}