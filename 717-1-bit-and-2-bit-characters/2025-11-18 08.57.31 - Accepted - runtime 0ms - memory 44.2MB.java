class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        if(bits.length == 1)
        {
            if(bits[0] == 0)
            {
                return true;
            }
            return false;
        }
        int valid = 0;
        for(int i = 0 ; i < n-1 ; i++)
            {
                if (bits[i] == 0) valid++;
                else if(bits[i] == 1)
                {
                    valid+=2;
                    i++;
                }
            }
        if(bits.length-1 - valid == 0) return true;
        return false;
            
    }
}