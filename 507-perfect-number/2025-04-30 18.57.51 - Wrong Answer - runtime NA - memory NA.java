class Solution {
    public boolean checkPerfectNumber(int num) {

        int sqroot = (int)Math.sqrt(num);
        int count = 1;
        int sum =0;
        int temp = num;
        if(num <= 0)
        {
            return false;
        }
        while(count<=sqroot)
        {
            if(num%count == 0)
            {
                sum+=count;

            }
            int otherfactor = num/count;
            if(otherfactor!=count &&count!=1)
            {
                sum+=otherfactor;
            }
            count++;

            
        }
        if(sum == temp)
            {
                return true;

            }
            else
            {
                return false;
            }
            
        
    }
}