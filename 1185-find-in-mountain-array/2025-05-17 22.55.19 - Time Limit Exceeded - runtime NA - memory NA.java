/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
    int peak = findpeak(mountainArr);
    int start = 0;
    int size = mountainArr.length();
    int end = size-1;
    int ans = -1;

    while(start <= peak)
    {
        int mid = start + (end-start)/2;
        if(mountainArr.get(mid) == target)
        {
            ans = mid;
            break;
        }
        else if(mountainArr.get(mid) > target)
        {
            end = mid-1;
        }
        else
        {
            start = mid+1;
        }
        

    }
    if(ans != -1)
    {
        return ans;
    }
    start = peak+1;

    while(start <= end)
    {
        int mid = ((start) + (end - (start))/2);
        if(mountainArr.get(mid) == target)
        {
            ans = mid;
            break;
        }
        else if (mountainArr.get(mid) > target)
        {
            start =mid+1; 
        }
        else
        {
            end = mid-1;
        }
    }
    return ans;

        
    }

    static int findpeak(MountainArray mountainArr)
    {
        int start = 0;
        int size = mountainArr.length();
        int end = size-1;
        int peak = -1;

        while(start <= end)
        {
            int mid = (start+(end-start)/2);
            if(mid != 0 && mid != size-1 && mountainArr.get(mid)         >mountainArr.get(mid+1) && mountainArr.get(mid) > mountainArr.get(mid-1))
            {
                peak = mid;
                return peak;

            }
            else if(mid != size-1 && mountainArr.get(mid)<mountainArr.get(mid+1))
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }

        }
        return peak;

    }
}