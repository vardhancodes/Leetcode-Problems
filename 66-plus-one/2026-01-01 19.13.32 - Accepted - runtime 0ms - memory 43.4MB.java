class Solution {
    public int[] plusOne(int[] digits) {
        int index = digits.length-1;
        int count = 0;
        while( index >= 0 && digits[index] == 9 )
        {
            digits[index] = 0;
            index--;
            count++;
        }
        if(index < 0)
        {
            int[] dig = new int[count+1];
            for(int i = 0 ; i < dig.length ; i++)
            {
                if(i == 0)
                {
                    dig[i] = 1;
                }
                else
                {
                    dig[i] = 0;
                }
            }
            return dig;
        }
        digits[index]++;
        return digits;
    }
}