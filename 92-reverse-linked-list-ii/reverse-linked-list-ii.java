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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || right == left )
        {
            return head;
        }
        ListNode temp = head;
        ListNode leftnode = null;
        ListNode rightnode = null;
        ListNode prevleft = null;
        int counter = 1;
        while(temp != null)
        {
            if(counter == left)
            {
                leftnode = temp;
                break;
            }
            prevleft = temp;
            temp = temp.next;
            counter++;

        }
        temp = head;
        counter = 1;
        while(temp != null)
        {
            if(counter == right)
            {
                rightnode = temp;
                break;
            }
            temp = temp.next;
            counter++;
        }
        if(rightnode == null)
        {
            return head;
        }
        ListNode nextright = (rightnode.next == null)?null:rightnode.next;
        ListNode newTail = null;
        ListNode prev = null;
        ListNode end = nextright;
        while(leftnode != end)
        {
            ListNode nextNode = leftnode.next;
            if(prev == null)
            {
                newTail = leftnode;
            }
            leftnode.next = prev;
            prev = leftnode;
            leftnode = nextNode;
        }
        newTail.next = (nextright==null)?null:nextright;
        if(prevleft != null)
        {
            prevleft.next = prev;
        }
        else
        {
            head = prev;
            
        }

        return head;


        

        



    }

}