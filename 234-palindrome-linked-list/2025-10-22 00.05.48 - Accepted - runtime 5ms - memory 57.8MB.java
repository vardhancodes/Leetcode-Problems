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
        ListNode prev = null;
        ListNode slow = head;
        ListNode newHead = null;
        ListNode temp = null;

        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            ListNode newNode = new ListNode(prev.val);

            if(newHead == null)
            {
                newHead = newNode;
                temp = newNode;
            }
            else
            {
                newHead = newNode;
                newHead.next = temp;
                temp = newNode;
            }            
        }

        if(fast != null)
        {
            slow = slow.next;
        }

        while(slow!= null && newHead!=null)
        { 
            if(slow.val != newHead.val)
            {
                return false;
            }
            slow = slow.next;
            newHead = newHead.next;
        }
        return true;
    }
}