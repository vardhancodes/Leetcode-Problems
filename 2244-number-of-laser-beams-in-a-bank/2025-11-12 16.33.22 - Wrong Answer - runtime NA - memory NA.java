class Solution {
    public int numberOfBeams(String[] bank) {
        int m = bank.length;
        int n = bank[0].length();
        int ans = 0;
        int prevcount = 0;
        for(int i = 0 ; i < n ; i++)
        {
            char ch = bank[0].charAt(i);
            if(ch == '1')
            {
                prevcount++;
            }
        }
        for(int i = 1; i < m ; i++)
        {
            int countdev = 0;
            for(int j = 0 ; j < n ; j++)
            {
                char ch = bank[i].charAt(j);
                if(ch == '1')
                {
                    countdev++;
                }
            }
            if(countdev == 0)
            {
                continue;
            }
            if(prevcount != 0)
            {
                ans+=prevcount*countdev;
                prevcount = countdev;
            }
            
        }
        return ans;
    }
}