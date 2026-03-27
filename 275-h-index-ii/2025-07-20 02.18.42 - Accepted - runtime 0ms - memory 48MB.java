class Solution {
    public int hIndex(int[] citations) {
    int size = citations.length;
    int start = 0;
    int end = size - 1;

    // Special case: Only one paper and it's cited
    if (size == 1 && citations[0] != 0) {
        return 1;
    }

    // Binary search for the smallest index where citations[i] >= size - i
    while (start <= end) {
        int mid = start + (end - start) / 2;

        // Number of papers with at least citations[mid] = size - mid
        if (citations[mid] < size - mid) {
            // Not enough citations, go right
            start = mid + 1;
        } else {
            // Might be the answer, go left to find smaller index
            end = mid - 1;
        }
    }

    // H-index is size - start
    return size - start;
}

}
