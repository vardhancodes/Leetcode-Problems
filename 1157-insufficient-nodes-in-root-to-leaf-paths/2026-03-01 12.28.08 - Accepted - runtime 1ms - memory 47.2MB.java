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
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        int[] sum = new int[1];
        if(!dfs(root,limit,sum))
        {
            return null;
        }
        return root;
    }

    public static boolean dfs(TreeNode root, int limit, int[] sum)
    {
        if(root == null)
        {
            return false;
        }
        sum[0] += root.val;
        if(root.left == null && root.right == null)
        {
            if(sum[0] < limit)
            {
                sum[0] -= root.val;
                return false;
            }
            else
            {
                sum[0] -= root.val;
                return true;
            }
            
        }

        
        boolean leftside = dfs(root.left,limit,sum);
        boolean rightside = dfs(root.right,limit,sum);

        

        if(!leftside && rightside)
        {
            root.left = null;
        }

        else if(!rightside && leftside)
        {
            root.right = null;
        }

        sum[0] -= root.val;

        return leftside || rightside;

        
    }
}