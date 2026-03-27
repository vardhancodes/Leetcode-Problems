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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum[] = new int[1];
        dfs(root,sum,false);
        return sum[0];
    }
    public static void dfs(TreeNode root , int[] sum, boolean isleft)
    {
        if(root == null)
        {
            return;
        }

        if(isleaf(root) && isleft)
        {
            sum[0] += root.val;
            return;
        }

        dfs(root.left,sum,true);
        dfs(root.right,sum,false);
    }

    public static boolean isleaf(TreeNode root)
    {
        if(root.left == null && root.right == null)
        {
            return true;
        }
        return false;
    }
}