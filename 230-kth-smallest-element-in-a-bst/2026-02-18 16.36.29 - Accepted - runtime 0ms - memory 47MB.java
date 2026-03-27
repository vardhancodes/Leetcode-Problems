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
    int pos = 0;
    public int kthSmallest(TreeNode root, int k) {
        return dfs(root,k);
        
    }
    public int dfs(TreeNode root , int target)
    {
        if(root == null)
        {
            return -1;
        }

        int found = dfs(root.left,target);
        if(found != -1)
        {
            return found;
        }
        pos++;
        if(pos == target)
        {
            return root.val;
        }
        
        return dfs(root.right,target);
    }
}