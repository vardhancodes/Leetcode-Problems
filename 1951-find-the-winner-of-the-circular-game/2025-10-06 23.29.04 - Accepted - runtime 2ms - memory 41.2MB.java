class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1 ; i <= n ; i++)
        {
            list.add(i);
        }
        return recur(list,k,0);
        
    }
    public int recur(ArrayList<Integer> list , int k , int ind)
    {
        if(list.size() == 1)
        {
            return list.get(0);
        }

        ind =(ind+k-1)%list.size();

        list.remove(ind);

        return recur(list,k,ind);
    }
}