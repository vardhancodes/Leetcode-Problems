class Solution {
    public boolean validMountainArray(int[] arr) {
        int index = 0;
        int size = arr.length;

        while(index < size-1)
        {
            if(arr[index] < arr[index+1])
            {
                index++;
            }
            else
            {
                break;
            }

        }
        if(index == 0 || index == size-1)
        {
            return false;
        }
        else
        {
            while(index < size-1)
            {
                if(arr[index] > arr[index+1])
                {
                    index++;
                }
                else
                {
                    return false;
                }

            }
            return true;
        }
    }
}