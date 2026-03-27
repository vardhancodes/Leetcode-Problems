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
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode temp1 = head;
        ListNode temp2 = head;
        ListNode newHead = null;
        int size = 1; //taaki pehla node gine
        while(temp1.next != null)
        {
            size++;
            temp1 = temp1.next;
            
        }
        System.out.println(size);
        k=k%size;
        while(k!=0)
        {
            temp2 = temp2.next;
            k--;
        }
        newHead = temp2.next;
        temp1.next = head;
        temp2.next = null;
        return newHead;
        



    }

}