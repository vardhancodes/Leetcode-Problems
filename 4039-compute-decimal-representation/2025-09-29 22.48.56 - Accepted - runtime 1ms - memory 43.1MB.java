class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();
        int x = 1;
        while(n != 0)
        {
            int rev = (n%10);
            if( rev != 0)
            {
                rev*= x;
                list.add(0,rev);

            }
            x*=10;
            n/=10;
            
        }
        int ans[] = new int[list.size()];

        for(int i = 0 ; i < list.size() ; i++)
        {
            ans[i] = list.get(i);

        }

        return ans;

        
    }
}