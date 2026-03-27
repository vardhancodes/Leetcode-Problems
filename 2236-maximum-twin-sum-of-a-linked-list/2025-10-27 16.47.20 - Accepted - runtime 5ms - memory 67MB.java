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
    public int pairSum(ListNode head) {
        ListNode prev = null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = null;
        ListNode newHead = null;
        while(fast!=null)
        {
            prev = slow;
            if(newHead == null)
            {
                newHead = new ListNode(prev.val);
                temp = newHead;
            }
            else
            {
                newHead = new ListNode(prev.val);
                newHead.next = temp;
                temp = newHead;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        int ans = 0;
        while(temp!=null && slow != null)
        {
            int sum = temp.val+slow.val;
            ans = Math.max(ans,sum);
            temp=temp.next;
            slow=slow.next;

        }
        return ans;

    }
}