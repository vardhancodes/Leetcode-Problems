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
    public int countNodes(TreeNode root) {
        if(root == null)
        {
            return 0;
        }

        int lh = LeftCount(root);
        int rh = RightCount(root);

        if(rh == lh)
        {
            return (int)Math.pow(2,lh)-1;
        }
        
        return 1+countNodes(root.right)+countNodes(root.left);
    }
    public static int LeftCount(TreeNode root)
    {
        int count = 1;
        while(root.left != null)
        {
            count++;
            root = root.left;
        }

        return count;
    }
    public static int RightCount(TreeNode root)
    {
        int count = 1;
        while(root.right != null)
        {
            count++;
            root = root.right;
        }

        return count;
    }
}