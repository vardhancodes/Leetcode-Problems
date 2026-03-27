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
    public int findTilt(TreeNode root) {
        int sum[] = new int[1];
        dfs(root,sum);
        return sum[0];
    }

    public static int dfs(TreeNode root , int[] sum)
    {
        if(root == null)
        {
            return 0;
        }

        int leftsum = dfs(root.left,sum);
        int rightsum = dfs(root.right,sum);
        
        sum[0] += Math.abs(leftsum-rightsum);

        return root.val+leftsum+rightsum;


    }
}