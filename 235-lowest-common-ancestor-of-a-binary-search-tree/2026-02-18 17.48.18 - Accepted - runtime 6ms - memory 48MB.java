/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
        {
            return null;
        }

        if(root.val == p.val)
        {
            return p;
        }
        if(root.val == q.val)
        {
            return q;
        }

        TreeNode found1 = lowestCommonAncestor(root.left,p,q);
        TreeNode found2 = lowestCommonAncestor(root.right,p,q);

        if(found1 != null && found2 != null)
        {
            return root;
        } 
        else if(found1 != null)
        {
            return found1;
        }
        else
        {
            return found2;
        }
    }

}