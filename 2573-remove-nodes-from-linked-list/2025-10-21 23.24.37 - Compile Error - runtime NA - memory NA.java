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
        ArrayList<Integer> list = new ArrayList<>();
        int maxSofar = ;
        ListNode temp = head;
        while(temp != null)
        {
            if(temp.val > maxSofar)
            {
                list.add(temp.val);
                maxSofar = temp.val;
            }
            temp = temp.next;
        }
       
        
    }
}