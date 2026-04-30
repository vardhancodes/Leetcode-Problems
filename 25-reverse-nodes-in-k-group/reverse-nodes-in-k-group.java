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
        ListNode ans = null;
        ListNode prevHead = null;
        ListNode currHead = head;
        for(int i = 0 ; i < groups ; i++)
        {
            ListNode curr = currHead;
            ListNode prev = null;
            for(int j = 0 ; j < k ; j++)
            {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            if(prevHead == null)
            {
                ans = prev;
            }
            else
            {
                prevHead.next = prev;
            }
            prevHead = currHead;
            currHead = curr;

        }
        if(currHead != null)
        {
            prevHead.next = currHead;
        }

        return ans;

       
    }


        


    
}