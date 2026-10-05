class Solution {
    public int findCenter(int[][] edges) {
        int size = edges.length*2;
        int[] degree = new int[size+1];
        int max = 0;

        for(int arr[] : edges)
        {
            if(arr[0] > max)
            {
                max = arr[0];
            }
            if(arr[1] > max)
            {
                max = arr[1];
            }
            degree[arr[0]]++;
            degree[arr[1]]++;
        }

        for(int i = 0 ; i < degree.length ; i++)
        {
            if(degree[i] == max-1)
            {
                return i ;
            }
        }

        return -1;
    }
}