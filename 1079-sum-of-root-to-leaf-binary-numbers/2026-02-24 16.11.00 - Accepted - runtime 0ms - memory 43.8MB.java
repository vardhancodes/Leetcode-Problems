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
    public int sumRootToLeaf(TreeNode root) {
        int sum[] = new int[1];
        dfs(root,sum,0);
        return sum[0];
    }

    public static void dfs(TreeNode root, int[] sum, int bin)
    {
        if(root == null)
        {
            return;
        }
        bin = bin*2+root.val;
        if(isLeaf(root))
        {
            sum[0] += bin;
            return;
        }
        
        dfs(root.left,sum,bin);
        dfs(root.right,sum,bin);
        
    }

    public static boolean isLeaf(TreeNode root)
    {
        if(root.left == null && root.right == null)
        {
            return true;
        }
        return false;
    }
}