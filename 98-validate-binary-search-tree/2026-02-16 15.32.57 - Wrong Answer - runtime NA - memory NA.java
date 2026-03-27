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
    public boolean isValidBST(TreeNode root) {
        return isvalid(root,0,false);
    }

    public static boolean isvalid( TreeNode root, int prev, boolean isleft)
    {
        if(root == null)
        {
            return true;
        }

        if(root.val >= prev && isleft)
        {
            return false;
        }
        else if(root.val <= prev && !isleft)
        {
            return false;
        }

        return isvalid(root.left,root.val,true)&& isvalid(root.right,root.val,false);
    }
}