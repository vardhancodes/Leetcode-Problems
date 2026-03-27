class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        recur(nums,k,0,sublist,list);
        return list.size()-1;

        
    }
    public static boolean isValid(ArrayList<Integer> sublist)
    {
        for(int i = 0 ; i < sublist.size() ; i++)
        {
            for(int j = 0 ; j < sublist.size() ; j++)
            {
                if(Math.abs(sublist.get(i)-sublist.get(j)) == k)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void recur(int[] nums, int k , int ind , ArrayList<Integer> sublist, ArrayList<List<Integer>> list)
    {
        int n = nums.length;
        if(ind == n)
        {
            if(isValid(sublist))
            {
                list.add(new ArrayList<Integer>(sublist));

            }
            return;
        }

        sublist.add(nums[ind]);
        recur(nums,k,ind+1,sublist,list);
        sublist.remove(sublist.size()-1);
        recur(nums,k,ind+1,sublist,list);
        

    }
}