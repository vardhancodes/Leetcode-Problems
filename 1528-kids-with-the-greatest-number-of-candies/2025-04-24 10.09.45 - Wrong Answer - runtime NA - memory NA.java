class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int size = candies.length;
        int max = candies[0];

        for(int i =0 ; i<size ; i++)
        {
            if(candies[i] > max)
            {
                max = candies[i];
            }

        }

        List<Boolean> output = new ArrayList<>();
        output.add(true);
        
        

        for(int i =1 ; i < size ; i++)
        {
            if((candies[i]+extraCandies) > max)
            {
                output.add(true);
                
            }
            else
            {
                output.add(false);
            }


        }

        return output;


        
    }
}