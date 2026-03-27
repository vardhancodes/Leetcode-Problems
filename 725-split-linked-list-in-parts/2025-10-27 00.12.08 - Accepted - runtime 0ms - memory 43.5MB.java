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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode ans[] = new ListNode[k];
        if(head == null || k == 0)
        {
            ans[0] = head;
            return ans;
        }
        ListNode temp = head;
        int size = 0;
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }
        int eachsize = size/k;
        int extraNodes = size%k;
        temp = head;
        for(int i = 0 ; i < k ; i++)
        {
            int len = 1;
            if(temp==null) break;
            ListNode currhead = temp;
            ListNode prev = null;
            while(temp!=null && len<eachsize+1)
            {
                prev=temp;
                temp=temp.next;
                len++;
            }
            if(extraNodes>0)
            {
                prev = temp;
                temp = temp.next;
                extraNodes--;
            }
            prev.next = null;
            ans[i] = currhead;
        }
        return ans;
    }
}