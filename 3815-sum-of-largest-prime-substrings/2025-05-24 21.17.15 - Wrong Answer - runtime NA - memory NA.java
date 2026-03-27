class Solution {
    public long sumOfLargestPrimes(String s) {

        int n = Integer.parseInt(s);
        if(n < 2)
        {
            return 0;
        }
        if(n == 2)
        {
            return 2;
        }
        int i =0;
        int temp =n;
        int count = (int)(Math.log10(n)+1);
        int ans[] = new int[count+1];
        for(int j = 0 ; j < count+1 ; j++)
        {
            int x =10;
            int ctemp = temp;
            while(ctemp != 0)
            {
            
                int rem = ctemp%x;
                if(isPrime(rem))
                {
                    ans[i] = rem;
                    i++;
                }
                if( rem >= ctemp)
                {
                    break;
                }
                x = x*10;
            }
            temp /= 10;
        }

        Arrays.sort(ans);
         if (i < 3) {
            long product = 1;
            boolean found = false;
            for (int k = 0; k < i; k++) {
                if (ans[k] > 0) {
                    product *= ans[k];
                    found = true;
                }
            }
            return found ? product : 0;
        }


        long result = ans[count]*ans[count-1]*ans[count-2];
        return result;
    }
    
    static boolean isPrime(int x)
    {
        if( x < 2)
        {
            return false;
            
        }
        for(int i = 2 ; i*i <= x ; i++)
            {
                if(x%i == 0)
                {
                    return false;
                }
            }
        return true;
    }
}