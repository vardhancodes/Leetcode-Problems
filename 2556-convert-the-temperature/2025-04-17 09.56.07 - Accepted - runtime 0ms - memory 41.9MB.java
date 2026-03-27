class Solution {
    public double[] convertTemperature(double celsius) {
        double kel = 273.15 + celsius;
        double far =  (celsius * 9/5) + 32;

        double ans[] = {kel,far};

        for (int i = 0; i < ans.length; i++) {
            ans[i] = Math.round(ans[i] * 1e5) / 1e5;
        }

        return ans;
    }
    
}