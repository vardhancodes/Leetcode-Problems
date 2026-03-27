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
        int pos[] = new int[1];
        return dfs(root,k,pos);
        
    }

    public static int dfs(TreeNode root , int target, int[] pos)
    {
        if(root == null)
        {
            return -1 ;
        }

        int found = dfs(root.left,target,pos);
        pos[0]++;
        if(pos[0] == target)
        {
            return root.val;
        }
        if(found == -1)
        {
            return dfs(root.right,target,pos);
        }
        else
        {
            return found;
        }
    }
}