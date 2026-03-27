class Solution {
    public int countArrangement(int n) {
        List<Integer> list = new ArrayList<>();
        int []count = new int[1];
        recur(list,n,count);
        return count[0];
    }

    public static void recur(List<Integer> list, int n, int[] count)
    {
        if(list.size() == n)
        {
            if(isBeautiful(list))
            {
                count[0]++;
                
            }
            return;
        }
        

        for(int i = 1 ; i <= n ; i++)
        {
            if(!list.contains(i))
            {
                list.add(i);
                recur(list,n,count);
                list.remove(list.size()-1);
            }
            
        }
    }

    public static boolean isBeautiful(List<Integer> list)
    {
        for(int i = 0 ; i < list.size() ; i++)
        {
            if(list.get(i)%(i+1) != 0)
            {
                return false;
            }

            if((i+1)%list.get(i) != 0)
            {
                return false;
            }
        }

        return true;
    }
}

