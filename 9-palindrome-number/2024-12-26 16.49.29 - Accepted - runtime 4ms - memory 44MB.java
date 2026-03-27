class Solution {
    public boolean isPalindrome(int x) {
        int rem;
        int rev = 0;
        int temp = x;

        while(x>0)
        {
            rem = x%10;
            rev = rev*10 + rem;
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE)
            {
                break;
            }
            x = x/10;
        }

        if(rev == temp)
        {
            return true;
        }
        else
        {
            return false;
        }

        
    }
}