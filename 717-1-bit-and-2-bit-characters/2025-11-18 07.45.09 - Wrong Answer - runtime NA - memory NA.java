class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits.length == 1)
        {
            if(bits[0] == 0)
            {
                return true;
            }
            return false;
        }
        if(bits[bits.length-2] == 0)
        {
            return true;
        }
        return false;
    }
}