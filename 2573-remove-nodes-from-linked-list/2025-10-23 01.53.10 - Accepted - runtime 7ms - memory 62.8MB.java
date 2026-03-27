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
    public ListNode removeNodes(ListNode head) {
        if(head == null)
        {
            return head;
        }
        head = reverse(head);
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        int maxsofar = 0;
        while(temp!=null)
        {
            if(temp.val >= maxsofar)
            {
                list.add(temp.val);
                maxsofar = temp.val;
            }
            temp = temp.next;
        }
        ListNode head2 = null;
        ListNode temp2 = null;
        for(int i = list.size()-1 ; i>=0 ; i--)
        {
            ListNode newNode = new ListNode(list.get(i));
            if(head2 == null)
            {
                head2 = newNode;
                temp2 = newNode;
            }
            else
            {
                temp2.next = newNode;
                temp2 = newNode;
            }

        }
        return head2;

    }
    public static ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null)
        {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}