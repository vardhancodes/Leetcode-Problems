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
        ListNode temp = head;
        while(temp != null)
        {
            list.add(temp.val);
            temp = temp.next;
        }
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < list.size() ; i++)
        {
            while(!stack.isEmpty() && stack.peek()<list.get(i))
            {
                stack.pop();
            }
            stack.push(list.get(i));
        }

        ListNode head2 = null;
        ListNode temp2 = null;
        while(!stack.isEmpty())
        {
            ListNode newNode = new ListNode(stack.pop());
            if(head2 == null)
            {
                head2=newNode;
                temp2 = head2;            
            }
            else
            {
                head2 = newNode;
                head2.next = temp2;
                temp2 = head2;
            }
            
        }
        return head2;
    }
}