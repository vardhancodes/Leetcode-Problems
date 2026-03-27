class Solution {
    public int countPrimes(int num) {

        boolean arr[] = new boolean[num+1];
        int count=0;
        Arrays.fill(arr,true);
        int counter = 2;
        while(counter<num)
        {
            if(arr[counter] == true)
            {
                for(int factor = counter+counter; factor <=num; factor+=counter){
                    arr[factor] = false;
                }
            }
            counter++;
        }

        for(int i=2 ; i<num ; i++)
        {
            if(arr[i] == true)
            {
                count++;
            }
        }

        return count;
        



        
    }
}