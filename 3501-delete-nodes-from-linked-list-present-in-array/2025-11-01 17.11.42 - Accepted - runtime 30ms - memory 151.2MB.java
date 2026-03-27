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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ListNode newHead = new ListNode(-1);
        ListNode temp = head;
        ListNode tail = newHead;
        while(temp!=null)
        {
            if(map.containsKey(temp.val))
            {
                temp = temp.next;
                continue;
            }
            else
            {
                ListNode nextNode = temp.next;
                tail.next = temp;
                tail = tail.next;
                temp.next = null;
                temp = nextNode;
            }
        }
        return newHead.next;

    }
}