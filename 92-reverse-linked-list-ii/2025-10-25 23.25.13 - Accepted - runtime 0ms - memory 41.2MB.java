/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right)
        {
            return head;
        }
        ListNode prev = null;
        ListNode start = head;
        for(int i = 0 ; i < left-1 ; i++)
        {
            if(start == null)
            {
                return head;
            }
            prev = start;
            start = start.next;
        }
        ListNode end = head;
        for(int i = 0 ; i < right-1 ; i++)
        {
            if(end == null)
            {
                return head;
            }
            end = end.next;
        }
        ListNode tail = end.next;
        ListNode newHead = reverse(start,end);
        if(prev != null)
        {
            prev.next = newHead;
        }
        else
        {
            head = newHead;
        }
        start.next = tail;
        return head;

    }
    public static ListNode reverse(ListNode start , ListNode end)
    {
        ListNode curr = start;
        ListNode prev = null;
        ListNode stop = end.next;
        while(curr != stop)
        {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;

    } 
}