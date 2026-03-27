class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int money = 1;
        int newmoney = 1;
        int ind = 0;
        while(ind < n)
        {
            if(ind%7 == 0 && ind != 0)
            {
                newmoney++;
                money = newmoney;

            }
            sum+=money;
            money++;
            ind++;
        }
        return sum;
    }
}