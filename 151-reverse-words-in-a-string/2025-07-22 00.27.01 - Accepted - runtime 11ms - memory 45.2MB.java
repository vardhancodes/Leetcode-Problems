class Solution {
    public String reverseWords(String s) {
        String[] ans = s.split(" ");
        String result ="";
        for(int i = 0 ; i < ans.length ; i++)
        {
            if(ans[i] == "")
            {
                continue;
            }
            else
            {
                if(i == ans.length-1)
                {result = ans[i]+result;
                }
                else
                {result = " "+ans[i]+result;
                }

            
            }
        }
        return result;


        
    }
}