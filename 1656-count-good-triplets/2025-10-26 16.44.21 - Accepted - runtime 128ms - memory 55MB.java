class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> sublist = new ArrayList<Integer>();
        recur(list,sublist,0,arr,a,b,c);
        return list.size(); 
    }
    public void recur(List<List<Integer>> list , List<Integer> sublist , int ind , int[] arr, int a , int b , int c)
    {
        if(sublist.size()==3)
        {
            if(isGoodTriplet(sublist,a,b,c))
            {
                list.add(new ArrayList<Integer>(sublist));
            }
            return;
        }

        for(int i = ind ; i < arr.length ; i++)
        {
            sublist.add(arr[i]);
            recur(list,sublist,i+1,arr,a,b,c);
            sublist.remove(sublist.size()-1);
        }
    }
    public static boolean isGoodTriplet(List<Integer> sublist ,int a , int b , int c)
    {
        int x = sublist.get(0);
        int y = sublist.get(1);
        int z = sublist.get(2);

        if (Math.abs(x - y) <= a && Math.abs(y - z) <= b && Math.abs(x - z) <= c) {
            return true;
        }
        return false;
    }
}