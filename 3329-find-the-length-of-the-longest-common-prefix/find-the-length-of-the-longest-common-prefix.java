class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<>();
        int ans = 0; 
        for(int i = 0 ; i < arr1.length ; i++)
        {
            String s = String.valueOf(arr1[i]);
            for(int j = 0 ; j < s.length() ; j++)
            {
                set.add(s.substring(0,j+1));
            }
        }

        for(int i = 0 ; i < arr2.length ; i++)
        {
            int len = 0;
            String s = String.valueOf(arr2[i]);
            for(int j = 0 ; j < s.length() ; j++)
            {
                if(set.contains(s.substring(0,j+1)))
                {
                    len++;
                }
                else
                {
                    break;
                }
            }

            ans = Math.max(ans,len);
        }



        return ans;

    }
}