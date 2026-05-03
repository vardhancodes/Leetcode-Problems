class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i = 0 ; i < s.length() ; i++)
        {
            String last = s.substring(0,i+1);
            if(((s.substring(i+1,s.length())+last).equals(goal)))
            {
                return true;
            }
        }

        return false;
    }
}