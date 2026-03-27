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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recur(root,list);
        return list;
    }
     public static void recur(TreeNode root, List<Integer> list)
    {
        if(root == null)
        {
            return;
        }
        recur(root.left,list);
        recur(root.right,list);
        list.add(root.val);
        
    }
}