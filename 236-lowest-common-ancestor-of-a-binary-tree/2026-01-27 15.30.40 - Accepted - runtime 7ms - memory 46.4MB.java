/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)
        {
            return root;
        }
        TreeNode leftchild = lowestCommonAncestor(root.left,p,q);
        TreeNode rightchild = lowestCommonAncestor(root.right,p,q);

        if(leftchild == null)
        {
            return rightchild;
        }
        if(rightchild == null)
        {
            return leftchild;
        }
        else
        {
            return root;
        }



    }
}