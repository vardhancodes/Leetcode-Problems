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
    public void flatten(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(list,root);
        TreeNode prev = root;
        for(int i = 1 ; i < list.size() ; i++)
        {
            TreeNode newNode = new TreeNode(list.get(i));
            prev.right = newNode;
            prev.left = null;
            prev = prev.right;
            

        }
    }

    public void dfs(List<Integer> list, TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        list.add(root.val);
        dfs(list,root.left);
        dfs(list,root.right);
    }
}