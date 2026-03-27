class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> sublist = new ArrayList<Integer>();
        recur(list,sublist,k,0,n);
        return list;
        
        
    }
   public static void recur(List<List<Integer>> list , List<Integer> sublist , int k ,int ind,int n)
    {
        if(sublist.size() == k)
        {
            list.add(new ArrayList<Integer>(sublist));
        }

        for(int i = ind+1 ; i <= n ; i++)
        {
            sublist.add(i);
            recur(list, sublist, k, i, n);
            sublist.remove(sublist.size()-1);

        }
    }

    
}