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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode org = root;
        TreeNode temp = root;
        TreeNode prev = root;
        boolean isleft = false;
        if(root == null)
        {
            return new TreeNode(val);
        }
        while(temp != null)
        {
            if(temp.val > val)
            {
                prev = temp;
                temp = temp.left;
                isleft = true;
            }
            else
            {
                prev = temp;
                temp = temp.right;
                isleft = false;
            }
        }

        if(isleft)
        {
            prev.left = new TreeNode(val);
        }
        else
        {
            prev.right = new TreeNode(val);
        }

        return org;

    }
}