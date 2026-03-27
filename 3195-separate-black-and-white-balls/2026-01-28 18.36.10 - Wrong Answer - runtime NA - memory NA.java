class Solution {
    public long minimumSteps(String s) {
        char prev = s.charAt(0);
        int count = 0;
        for(int i = 1; i < s.length() ; i++)
        {
            char curr = s.charAt(i);
            if(prev == '1' && curr == '0')
            {
                count++;
            }
            else
            {
                prev = s.charAt(i);
            }
            
        }
        return count;
    }

}