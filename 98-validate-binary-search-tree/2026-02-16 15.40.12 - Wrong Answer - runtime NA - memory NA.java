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
        return isvalid(root,0,false,true);
    }

    public static boolean isvalid( TreeNode root, int prev, boolean isleft, boolean first)
    {
        if(root == null)
        {
            return true;
        }
        if(!first)
        {
            if(root.val >= prev && isleft)
            {
                return false;
            }
            else if(root.val <= prev && !isleft)
            {
            return false;
            }
        }

        

        return isvalid(root.left,root.val,true,false)&& isvalid(root.right,root.val,false,false);
    }
}