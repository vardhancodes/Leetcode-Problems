class Solution {
    public int reverse(int num) {
        int rem=0;
        int rev=0;
        
        for(int i =0; num!=0 ; i++)
        {
            rem = num%10;
            if(rev> Integer.MAX_VALUE/10 || rev< Integer.MIN_VALUE/10)
            {
                return 0;
            }
            rev = (rev*10) + rem;
            num=num/10;

        }
           
        

        return rev;
        
    }
}