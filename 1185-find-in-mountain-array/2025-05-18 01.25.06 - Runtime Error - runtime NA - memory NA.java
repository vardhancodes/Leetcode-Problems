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
        int start = 0;
        int size = mountainArr.length();
        int end = size-1;
        int peak = -1;


        while(start <= end)
        {
            int mid = (start + (end-start)/2);
            int midval = mountainArr.get(mid);
            int midvalnext = mountainArr.get(mid+1);
            int midprev = mountainArr.get(mid-1);
            if(mid != 0 && mid != size-1 && midval>midvalnext && midval>midprev)
            {
                if(mountainArr.get(mid) == target)
                {
                    return mid;
                }
                peak = mid;
                break;
            }
            else if(mid != size-1 && mountainArr.get(mid) < mountainArr.get(mid+1))
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }

        }

        start = 0;
        end = peak;
        int ans = -1;

        while(start <= end)
        {
            int mid = (start + (end-start)/2);
            int midval = mountainArr.get(mid);
            if(midval == target )
            {
                ans = mid;
                return ans;

            }
            else if(midval < target)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }

        }

        start = peak+1;
        end = size-1;

        while(start <= end)
        {
            int mid = (start + (end-start)/2);
            int midval = mountainArr.get(mid);
            if(midval == target )
            {
                ans = mid;
                return ans;

            }
            else if(midval < target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }

        }

        return ans;
        
    }
}