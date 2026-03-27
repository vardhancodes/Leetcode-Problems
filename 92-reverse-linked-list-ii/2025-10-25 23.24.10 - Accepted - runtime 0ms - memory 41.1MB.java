class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;

        ListNode prev = null;
        ListNode start = head;
        ListNode end = head;

        // Move start to left-th node
        for(int i = 0; i < left-1; i++) {
            if(start == null) return head;
            prev = start;
            start = start.next;
        }

        // Move end to right-th node starting from head
        for(int i = 1; i < right; i++) { // start from 1 because head is already 1st node
            if(end == null) return head;
            end = end.next;
        }

        // Safety check
        if(start == null || end == null) return head;

        ListNode tail = end.next;
        ListNode newHead = reverse(start, end);

        if(prev != null) prev.next = newHead;
        else head = newHead;

        start.next = tail;
        return head;
    }

    public static ListNode reverse(ListNode start, ListNode end) {
        ListNode curr = start;
        ListNode prev = null;
        ListNode stop = end.next; // safe stopping point
        while(curr != stop) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
