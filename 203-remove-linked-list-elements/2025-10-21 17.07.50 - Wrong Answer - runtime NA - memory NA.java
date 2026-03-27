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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val)
        {
            head = head.next;
        }
        ListNode current = head;
        while(current != null && current.next != null)
        {
            ListNode temp = current.next;
            if(temp.val == val)
            {
                current.next = temp.next;
                current = temp;

            }
            else
            {
                current = current.next;
            }
            
        }
        return head;
    }
}