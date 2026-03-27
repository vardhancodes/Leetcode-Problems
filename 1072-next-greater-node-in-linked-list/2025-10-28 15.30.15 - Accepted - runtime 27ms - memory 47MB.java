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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while(temp!=null)
        {
            list.add(temp.val);
            temp = temp.next;
        }
        int[] ans = new int[list.size()];
        Stack<Integer> stack = new Stack<>();
        for(int i = list.size()-1 ; i >=0 ; i--)
        {
            while(!stack.isEmpty() && stack.peek()<=list.get(i))
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                ans[i] = stack.peek(); 
            }
            else
            {
                ans[i] = 0;
            }
            stack.push(list.get(i));
        }
        return ans;
    }
}