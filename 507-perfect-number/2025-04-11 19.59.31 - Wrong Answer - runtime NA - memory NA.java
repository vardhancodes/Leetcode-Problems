class Solution {
    public boolean checkPerfectNumber(int num) {

        int counter = 1;
        if(num == 1)
        {
            return false;
        }
        int sum = 0;
        int sqroot = (int)Math.sqrt(num);
        while(counter<=sqroot)
        {
            if(num%counter == 0)
            {
                sum+=counter;
                int otherfactor=num/counter;
                if(counter!=otherfactor)
                {
                    sum+=otherfactor;
                }



            }
            counter++;
        }
        if(sum == num)
        {
            return true;
        }
        else
        {
            return false;
        }

        


    }
}