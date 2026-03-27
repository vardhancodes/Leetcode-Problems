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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;;
        ListNode newHead = null;
        ListNode tail = null;
        int sum = 0;
        while(temp!=null)
        {
            if(temp.val==0)
            {
                if(newHead == null)
                {
                    newHead = new ListNode(sum);
                    tail = newHead;
                }
                else
                {
                    tail.next = new ListNode(sum);
                    tail = tail.next;
                }
                sum=0;
            }
            else
            {
                sum+=temp.val;
            }
            temp = temp.next;

        }
        return newHead;
        
    }
}