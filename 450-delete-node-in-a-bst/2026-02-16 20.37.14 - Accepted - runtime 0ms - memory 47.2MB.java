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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
        {
            return root;
        }
        if(root.val > key)
        {
            root.left = deleteNode(root.left,key);
        }
        else if(root.val < key)
        {
            root.right = deleteNode(root.right,key);
        }
        if(root.val == key)
        {
            if(root.left == null && root.right == null)
            {
                return null;
            }
            if(root.left != null && root.right != null)
            {
                TreeNode node = findInorderpreced(root.left);

                root.val = node.val;

                root.left = deleteNode(root.left,node.val);
            }
            else
            {
                if(root.right != null)
                {
                    return root.right;
                }
                else
                {
                    return root.left;
                }
            }
        }

        return root;
    }

    public static TreeNode findInorderpreced(TreeNode root)
    {
        while(root.right != null)
        {
            root = root.right;
        }

        return root;
    }
}