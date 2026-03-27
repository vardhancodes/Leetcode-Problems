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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
        {
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        newHead = reverse(newHead);
        ListNode t1 = head;
        ListNode t2 = newHead;
        while(t2!=null)
        {
            ListNode m1 = t1.next;
            ListNode m2 = t2.next;
            t2.next = m1;
            t1.next = t2;
            t1 = m1;
            t2 = m2;
        }
        
    }
    public static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null)
        {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}