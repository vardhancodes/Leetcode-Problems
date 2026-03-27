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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
        {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

       slow = reverse(slow);

       while(slow!=null)
       {
            if(head.val != slow.val)
            {
                return false;
            }

            head = head.next;
            slow = slow.next;
       }

       return true;
    }

    public static ListNode reverse (ListNode head)
    {
        ListNode current = head;
        ListNode prev = null;

        while(current!= null)
        {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;

    }
}