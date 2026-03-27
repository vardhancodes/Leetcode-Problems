class Solution {
    public int hIndex(int[] citations) {
    int start = 0; 
    int size = citations.length;
    int end = size - 1;
    int ans = 0;

    if(size == 1 && citations[0] != 0 )
    {
        return 1;
    }


   while(start <= end)
    {
        int mid = start+(end-start)/2;
        if(citations[mid] < size-mid)
        {
            start=mid+1;
        }
        else
        {
            end = mid-1;
        }
    }
    return size-start;

    
}
}
