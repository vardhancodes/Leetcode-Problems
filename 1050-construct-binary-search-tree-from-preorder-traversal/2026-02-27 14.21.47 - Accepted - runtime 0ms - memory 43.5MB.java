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
    public TreeNode bstFromPreorder(int[] preorder) {
        int index[] = new int[1];
        return construct(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE,index);
    }

    public static TreeNode construct(int[] preorder, int min , int max, int[] index)
    {
        if(index[0] == preorder.length)
        {
            return null;
        }

        if(preorder[index[0]] > max || preorder[index[0]] < min)
        {
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[index[0]]);
        index[0]++;
        
        root.left = construct(preorder,min,root.val,index);
        root.right = construct(preorder,root.val,max,index);

        return root;


    }
}