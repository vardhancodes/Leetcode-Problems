class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> sublist = new ArrayList<Integer>();
        recur(0,n,k,list,sublist);
        return list;
        
        
    }
    public void recur(int ind, int n , int k , List<List<Integer>> list , List<Integer> sublist)
    {
        if(sublist.size() == k)
        {
            list.add(new ArrayList<Integer>(sublist));
            return;
        }

        for(int i = ind+1 ; i <=n ; i++)
        {
            sublist.add(i);
            recur(i,n,k,list,sublist);
            sublist.remove(sublist.size()-1);
        }

    }
}