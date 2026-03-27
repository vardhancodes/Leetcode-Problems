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
        for(int i = 0 ; i < a ; i++)
        {
            prev = start;
            start = start.next;
        }
        for(int i = 0 ; i <  b ; i++)
        {
            end = end.next;
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