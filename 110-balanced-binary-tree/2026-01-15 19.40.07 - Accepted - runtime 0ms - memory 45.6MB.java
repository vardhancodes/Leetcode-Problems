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
    public boolean isBalanced(TreeNode root) {
        boolean flag[] = new boolean[1];
        flag[0] = true;
        find(root,flag);
        return (flag[0] == true)?true:false;
    }
    public int find(TreeNode root,boolean []flag)
    {
        if(root == null)
        {
            return 0;
        }

        int lh = find(root.left,flag);
        int rh = find(root.right,flag);

        if(Math.abs(lh-rh) > 1)
        {
            flag[0] = false;
        } 

        return 1+Math.max(lh,rh);


    }
}