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
    public int sumNumbers(TreeNode root) {
        int []sum = new int[1];
        dfs(root,sum,0);
        return sum[0];
    }
    public static void dfs(TreeNode root , int[] sum , int path)
    {
        if(root == null)
        {
            return;
        }
        path = path*10 + root.val;
        if(isleaf(root))
        {
            sum[0] += path;
            return;
        }

        dfs(root.left,sum,path);
        dfs(root.right,sum,path);
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