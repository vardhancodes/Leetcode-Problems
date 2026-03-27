class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int money = 1;
        int recheck = 1;
        int ind = 0;
        while(ind < n)
        {
            if(ind%7 == 0 && ind != 0)
            {
                recheck++;
                money = recheck;

            }
            sum+=money;
            money++;
            ind++;
        }
        return sum;
    }
}