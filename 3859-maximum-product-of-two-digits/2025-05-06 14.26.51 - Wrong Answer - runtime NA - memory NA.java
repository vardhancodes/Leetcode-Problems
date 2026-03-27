class Solution {
    public int maxProduct(int n) {
        int count = (int)(Math.log(n)/Math.log(10))+1;
        int ans[] = new int[count+1];
        int i =0;
        while(n!=0)
        {
            
            int rem = n%10;
            ans[i] = rem;
            n = n/10;
            i++;
        }
        int max = ans[0]*ans[1];
        for(int j = 1 ; j<ans.length-1 ; j++)
        {
            if(max < ans[j]*ans[j+1])
                max = ans[j]*ans[j+1];
        }
        return max;
        
        
    }
}