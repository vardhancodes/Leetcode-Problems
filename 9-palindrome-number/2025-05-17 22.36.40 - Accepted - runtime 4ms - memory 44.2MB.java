class Solution {
    public boolean isPalindrome(int x) {

        int rem;
        int res = 0;
        int temp = x;
        if(x < 0 )
        {
            return false;
        }

        while ( x!= 0 )
        {
            rem = x%10;
            res = res*10 + rem;
            x /=10;
        }
        if(res == temp )
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}