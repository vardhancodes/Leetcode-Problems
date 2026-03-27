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
    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        TreeNode root = new TreeNode();
        int end = nums.length-1;
        int mid = start+(end-start)/2;
        root.val = nums[mid];
        TreeNode curr = root;
        int index = mid-1;
        while(index >= start)
        {
            TreeNode temp = new TreeNode(nums[index]);
            curr.left = temp;
            curr = curr.left;
            index--;

        }
        curr = root;
        index = mid+1;
        while(index <= end)
        {
            TreeNode temp = new TreeNode(nums[index]);
            curr.right = temp;
            curr = curr.right;
            index++;
        }

        return root;

    }
}