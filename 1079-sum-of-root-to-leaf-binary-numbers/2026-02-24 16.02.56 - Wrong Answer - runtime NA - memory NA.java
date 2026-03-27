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

    public static void dfs(TreeNode root, int[] sum, long bin)
    {
        if(root == null)
        {
            return;
        }
        bin = 10*bin + (root.val);
        if(isLeaf(root))
        {
            sum[0] += BinarytoInt(bin);
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

    public static int BinarytoInt(long bin)
    {
        int ans = 0;
        int i = 0;
        while(bin!= 0)
        {
           ans += Math.pow(2,i)*(bin%10);
           i++;
           bin /= 10;
        }

        return ans;
    }
}