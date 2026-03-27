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
        List<TreeNode> list = new ArrayList<>();
        if(root == null)
        {
            return;
        }
        if(root.right == null && root.left == null)
        {
            return;
        }
        preorder(root,list);
        TreeNode temp = root;
        for(int i = 0 ; i < list.size() ; i++)
        {
            temp.right = list.get(i);
            temp.left = null;
            temp = temp.right;

        }

    }
    private void preorder(TreeNode root, List<TreeNode> list)
    {
        if(root == null)
        {
            return;
        }

        list.add(root);
        preorder(root.left,list);
        preorder(root.right,list);
    }


}