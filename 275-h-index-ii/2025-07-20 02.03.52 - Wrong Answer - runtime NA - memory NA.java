class Solution {
    public int hIndex(int[] citations) {
    int start = 0; 
    int size = citations.length;
    int end = size - 1;
    int ans = -1;

    if(size < 2)
    {
        return 1;
    }


    while(start <= end)
    {
        int mid = start+(end-start)/2;
        if(citations[mid] <= size-mid)
        {
            ans = citations[mid];
            start = mid+1;
        }
        else
        {
            end = mid-1;
        }
    }
    return ans;

    
}
}
