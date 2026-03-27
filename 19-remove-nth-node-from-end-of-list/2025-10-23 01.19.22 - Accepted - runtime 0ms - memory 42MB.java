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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
        {
            return head;
        }
        if(head.next == null && n == 1)
        {
            return null;
        }
        ListNode temphead = reverse(head);
        if(n==1)
        {
            return reverse(temphead.next);
        }
        ListNode temp = temphead;
        for(int i = 1 ; i < n-1 && temp.next!= null ; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        head = reverse(temphead);
        return head;

    }
    public static ListNode reverse (ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null)
        {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;

    }
}