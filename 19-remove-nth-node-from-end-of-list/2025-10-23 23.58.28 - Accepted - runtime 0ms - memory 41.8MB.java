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
       ListNode first = head;
       ListNode second = head;
       while(n>0 && second!=null)
       {
            second = second.next;
            n--;
       }
       if(second == null)
       {
            return head.next;
       }
       ListNode prev = head;
       while(second!=null)
       {
            prev = first;
            first = first.next;
            second = second.next;
       }
       prev.next = first.next;
       first.next = null;

       return head;
        
    }
}