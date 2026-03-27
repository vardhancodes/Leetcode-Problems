class Solution {
    public int mySqrt(int num) {
        double tol = 0.0001;
        double ans ; 
        double root;
        double X = num;

        while(true)
        {
            root = 0.5*( X + (num/X));
            ans = X - root;
            if(Maths.abs(ans) < tol)
            {
                break;
            }
            X = root;
            
            

        }
        int answer = (int)root;
        return answer;
        

        
        
    }
}