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
    public int maxSumBST(TreeNode root) {
        int max[] = new int[1];
        dfs(root,max);
        return max[0];
    }

    public static int[] dfs(TreeNode root, int[] ans)
    {
        if(root == null)
        {
            return (new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE});
        }

        int[] leftsubtree = dfs(root.left,ans);
        int[] rightsubtree = dfs(root.right,ans);

        if(root.val > leftsubtree[1] && root.val < rightsubtree[2])
        {
            int currSum = leftsubtree[0] + rightsubtree[0] + root.val;
            ans[0] = Math.max(ans[0],currSum);
            int min = Math.min(leftsubtree[2],root.val);
            int max = Math.max(rightsubtree[1],root.val);

            return (new int[]{currSum,max,min});
        }
        return (new int[]{0,Integer.MAX_VALUE,Integer.MIN_VALUE});



    }
}