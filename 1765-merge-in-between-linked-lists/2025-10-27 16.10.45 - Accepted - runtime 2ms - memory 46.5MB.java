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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prev = null;
        ListNode start = list1;
        ListNode temp = list1;
        ListNode end = list1;
        while(temp!=null)
        {
            if(a!=0)
            {
                prev = start;
                start = start.next;
                a--;
            }
            if(b!=0)
            {
                end = end.next;
                b--;
            }
            temp = temp.next;
        }
        ListNode newHead = end.next;
        end.next = null;
        prev.next = list2;
        temp = list2;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = newHead;
        return list1;
    }
}