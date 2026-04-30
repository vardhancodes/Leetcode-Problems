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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null)
        {
            return head;
        }
        int total = 0;
        ListNode temp = head;
        while(temp != null)
        {
            temp = temp.next;
            total++;
        }
        int groups = total/k;
        ListNode dummy = new ListNode(-1);
        boolean newHead = false;
        ListNode head1 = null;
        ListNode curr = head;
        ListNode prev = null;
        ListNode newTail = null;
        int counter = 0; 
        for(int i = 0 ; i < groups ; i++)
        {
            while(counter != k)
            {
                ListNode nextNode = curr.next;
                curr.next = prev;
                if(prev == null)
                {
                    newTail = curr;
                }
                prev = curr;
                curr = nextNode;
                counter++;
            }
            dummy.next = prev;
            if(!newHead)
            {
                head1 = dummy;
                newHead = true;
            }
            dummy = newTail;
            counter = 0;
            prev = null;
        }

        if(curr != null)
        {
            dummy.next = curr;
        }

        return head1.next;

       
    }


        


    
}