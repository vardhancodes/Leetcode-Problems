;class Solution {
public:
    int numberOfSubarrays(vector<int>& nums, int k) {

        return atmostK(nums,k)-atmostK(nums,k-1);
        
    }
    int atmostK(vector<int>& nums, int k)
    {
        int n = nums.size();
        int i = 0 , j = 0;
        int count = 0;
        int ans  = 0;
        while(j<n){
            if(nums[j]%2 != 0){
                count++;
            }
            if(count > k){
                ans = max(ans,j-i);
                while(count > k){
                  if(nums[i] % 2 != 0){
                       count--;
                  }
                  i++;
                }
            }
            ans = max(ans , j-i+1);
            j++;
        }

        return ans;

    }
};