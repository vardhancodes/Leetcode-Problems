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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null )
        {
            return head;
        }
        int length = 1;
        ListNode temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
            length++;
        }
        k = k%length;
        if(k > 0)
        {
            ListNode temp2 = head;
            ListNode newHead = head.next;
            for(int i = 0 ; i < length-k-1; i++)
            {
                temp2 = temp2.next;
                newHead = newHead.next;
            }
            temp.next = head;
            temp2.next = null;
            return newHead;
        }
        return head;
        
    }

}