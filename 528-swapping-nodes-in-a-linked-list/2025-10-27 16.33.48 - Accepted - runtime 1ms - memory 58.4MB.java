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
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = head;
        ListNode prev1 = null;
        for(int i = 0 ; i < k-1 ; i++)
        {
            prev1 = first;
            first = first.next;
        }
        int val1 = first.val;
        ListNode nextNode1 = first.next;
        ListNode temp = first;
        ListNode prev2 = null;
        while(temp.next != null)
        {
            prev2 = second;
            second = second.next;
            temp = temp.next;
        }
        if(first == second)
        {
            return head;
        }
        int val2 = second.val;
        first.val = val2;
        second.val = val1;
        return head;
        
    }
}