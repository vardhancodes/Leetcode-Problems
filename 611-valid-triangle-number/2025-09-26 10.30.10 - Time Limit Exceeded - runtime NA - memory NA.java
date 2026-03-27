class Solution {
    public int triangleNumber(int[] nums) {
        int []count = new int[1];
        List<Integer> sublist = new ArrayList<Integer>();
        recur(0,nums,count,sublist);
        return count[0];



        
    }
    public void recur(int ind , int[] nums ,int[] count, List<Integer> sublist)
    {
        int n = nums.length;
        if(sublist.size() == 3)
        {
            if(isValid(sublist))
            {
                count[0]++;
            }
            return;
        }

        for(int i = ind ; i < n ; i++)
        {
            sublist.add(nums[i]);
            recur(i+1,nums,count,sublist);
            sublist.remove(sublist.size()-1);

        }
    }
    public static boolean isValid(List<Integer> sublist) {
        int a = sublist.get(0);
        int b = sublist.get(1);
        int c = sublist.get(2);

        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}