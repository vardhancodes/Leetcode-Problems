class Solution {
    public int findClosest(int x, int y, int z) {
        int x1 = Math.abs(y-x);
        int x2 = Math.abs(z-x);
        int y1 = Math.abs(z-y);

        if(x1 < x2 && x1 < y1 )
        {
            return 1;
        }
        else if(x2 < x1 && x2 < y1 )
        {
            return 1;
        }
        else if(y1 < x1 && y1 < x2)
        {
            return 2;
        }

        return 0;
        
    }
}