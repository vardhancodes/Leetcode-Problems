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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return dfs(root,k,set);
    }

    public static boolean dfs(TreeNode root, int target , HashSet<Integer> set)
    {
        if(root == null)
        {
            return false;
        }

        if(set.contains(Math.abs(target-root.val)))
        {
            return true;
        }

        set.add(root.val);

        return dfs(root.left,target,set) || dfs(root.right,target,set);
    }
}