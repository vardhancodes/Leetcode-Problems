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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ListNode start = head;
        ListNode end = head;
        if(head == null)
        {
            return null;
        }
        while(end != null)
        {
            end = end.next;
        }

        return construct(start,end);
    }

    public static TreeNode construct(ListNode start, ListNode end)
    {
        if(start == end)
        {
            return null;
        }

        ListNode mid = middle(start,end);
        TreeNode root = new TreeNode(mid.val);
        root.left = construct(start,mid);
        root.right = construct(mid.next,end);

        return root;
    }

    public static ListNode middle(ListNode start , ListNode end)
    {
        ListNode fast = start;
        ListNode slow = start;

        while(fast!= end && fast.next != end)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}